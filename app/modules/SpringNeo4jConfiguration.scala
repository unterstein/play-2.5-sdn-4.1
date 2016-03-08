package modules

import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation._
import org.springframework.data.neo4j.config.Neo4jConfiguration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * @author Johannes Unterstein (unterstein@me.com)
 */
@Configuration
@EnableNeo4jRepositories(basePackages = Array("neo4j.repositories"))
@EnableTransactionManagement
class SpringNeo4jConfiguration extends Neo4jConfiguration {

  @Bean
  override def getSessionFactory: SessionFactory = new SessionFactory("neo4j.models")
}