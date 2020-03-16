package hylabs.consolAppl.dao;

<<<<<<< HEAD
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
=======
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ILabRepository extends MongoRepository<HyLabData, Integer> {
>>>>>>> branch 'master' of https://github.com/Ogo-Ogo/HyLabs.git

}
