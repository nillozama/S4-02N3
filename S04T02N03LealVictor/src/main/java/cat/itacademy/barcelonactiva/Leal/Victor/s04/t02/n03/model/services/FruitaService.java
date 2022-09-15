package cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.repository.FruitaRepository;

@Service
public class FruitaService {
	
	@Autowired
	FruitaRepository fruitaRepository;
	
	 public List<Fruita> getAllFruits() {
	        List<Fruita> fruites = new ArrayList<Fruita>();
	        fruitaRepository.findAll().forEach(f -> fruites.add(f));
	        return fruites;
	    }

	    public Fruita getFruitaById(int id) {
	        return fruitaRepository.findById(id).get();
	    }

	    public void saveOrUpdate(Fruita fruita) {
	        fruitaRepository.save(fruita);
	    }

	    public void delete(int id) {
	    	fruitaRepository.deleteById(id);
	    }

}
