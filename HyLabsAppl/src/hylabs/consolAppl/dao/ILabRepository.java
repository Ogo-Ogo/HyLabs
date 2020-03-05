package hylabs.consolAppl.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ILabRepository extends MongoRepository<HyLabData, Integer> {

}
