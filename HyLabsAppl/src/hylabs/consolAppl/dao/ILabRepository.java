package hylabs.consolAppl.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import hylabs.consolAppl.dto.Task;
@Repository
public interface ILabRepository extends MongoRepository<Task, Integer> {



	Optional<Task> findByitemId(String itemId);

	void deleteByitemId(String id);

	List<Task> findAllBycompanyName(String companyName);

}
