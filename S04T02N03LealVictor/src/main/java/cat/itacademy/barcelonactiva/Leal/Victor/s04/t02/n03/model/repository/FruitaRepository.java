package cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.domain.Fruita;

@EnableMongoRepositories
public interface FruitaRepository extends MongoRepository<Fruita, Integer>{

}
