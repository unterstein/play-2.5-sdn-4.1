package modules

import com.typesafe.config.ConfigFactory
import org.neo4j.ogm.session.{Session, SessionFactory}
import org.springframework.context.annotation._
import org.springframework.data.neo4j.config.Neo4jConfiguration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.data.neo4j.server.{Neo4jServer, RemoteServer}
import org.springframework.transaction.annotation.EnableTransactionManagement
import play.api.Logger

/**
 * @author Johannes Unterstein (unterstein@me.com)
 */
@Configuration
@EnableNeo4jRepositories(basePackages = Array("neo4j.repositories"))
@EnableTransactionManagement
class SpringNeo4jConfiguration extends Neo4jConfiguration {

  private val host = ConfigFactory.load().getString("neo4j.host")
  private val user = ConfigFactory.load().getString("neo4j.user")
  private val password = ConfigFactory.load().getString("neo4j.password")

  if (Logger.isDebugEnabled) {
    Logger.debug("Connecting to remote database: " + user + "@" + host)
  }

  @Bean
  def graphDatabaseService(): Neo4jServer = new RemoteServer(host, user, password)

  @Bean
  @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
  override def getSession: Session = super.getSession

  @Bean
  override def getSessionFactory: SessionFactory = new SessionFactory("neo4j.models")
}