package neo4j.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ExampleObject {

  @GraphId
  public Long id;

  public String name;

}
