package neo4j.repositories;

import neo4j.models.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * The movie repository
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
public interface MovieRepository extends GraphRepository<Movie> {
}
