package neo4j.repositories;

import neo4j.models.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * The person repository
 *
 * @author Johannes Unterstein (unterstein@me.com)
 */
public interface PersonRepository extends GraphRepository<Person> {
}
