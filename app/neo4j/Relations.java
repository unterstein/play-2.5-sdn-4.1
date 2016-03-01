package neo4j;

/**
 * Interface declaring allowed relations between nodes
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
public interface Relations {
  static String ACTED_IN = "ACTED_IN";
  static String DIRECTED = "DIRECTED";
  static String PRODUCED = "PRODUCED";
  static String WROTE = "WROTE";
}
