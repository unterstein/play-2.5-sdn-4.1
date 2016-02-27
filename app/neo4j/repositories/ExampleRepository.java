package neo4j.repositories;

import neo4j.models.ExampleObject;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ExampleRepository extends GraphRepository<ExampleObject> {
}
