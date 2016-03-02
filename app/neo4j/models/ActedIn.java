package neo4j.models;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Rich relation between Movie and Person, including the ```roles``` information.
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
//@RelationshipEntity(type = "ACTED_IN")
public class ActedIn {

  @Property
  private String roles;

  @StartNode
  private Person person;

  @EndNode
  private Movie movie;
}
