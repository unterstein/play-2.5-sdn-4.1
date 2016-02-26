package modules

import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation._
import org.springframework.data.neo4j.config.Neo4jConfiguration
import org.springframework.data.neo4j.mapping.Neo4jMappingContext
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
  override def neo4jMappingContext: Neo4jMappingContext = {
    new Neo4jMappingContext(getSessionFactory.metaData)
  }

  @Bean
  override def getSessionFactory: SessionFactory = new SessionFactory("neo4j.models")
}