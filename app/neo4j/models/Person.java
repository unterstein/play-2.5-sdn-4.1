package neo4j.models;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Person entity
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
@NodeEntity
public class Person extends BaseModel {

  public String name;

  public Integer born;
}
