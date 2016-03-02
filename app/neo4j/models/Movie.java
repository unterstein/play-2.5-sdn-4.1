package neo4j.models;

import neo4j.Relations;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * Movie entity
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
@NodeEntity
public class Movie extends BaseModel {

  public String title;

  public Integer released;

  public String tagline;

//  @Relationship(type = Relations.ACTED_IN, direction = Relationship.INCOMING)
//  public Set<ActedIn> actors;

  @Relationship(type = Relations.DIRECTED, direction = Relationship.INCOMING)
  public Set<Person> directors;

  @Relationship(type = Relations.PRODUCED, direction = Relationship.INCOMING)
  public Set<Person> producers;

  @Relationship(type = Relations.WROTE, direction = Relationship.INCOMING)
  public Set<Person> writers;

}
