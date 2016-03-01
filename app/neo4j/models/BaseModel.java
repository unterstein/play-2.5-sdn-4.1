package neo4j.models;

import org.neo4j.ogm.annotation.GraphId;

/**
 * Base class for all neo entities
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
public abstract class BaseModel {

  @GraphId
  public Long id;
}
