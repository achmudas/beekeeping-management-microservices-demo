package co.kurapka.treatments.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.kurapka.treatments.model.Treatments;

public interface TreatmentsRepository extends MongoRepository<Treatments, String> {

}
