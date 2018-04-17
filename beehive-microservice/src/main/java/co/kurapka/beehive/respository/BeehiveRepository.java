package co.kurapka.beehive.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.kurapka.beehive.model.Beehive;

public interface BeehiveRepository extends MongoRepository<Beehive, String> {

}
