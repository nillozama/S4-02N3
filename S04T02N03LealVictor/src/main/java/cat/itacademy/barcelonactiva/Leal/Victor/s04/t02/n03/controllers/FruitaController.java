package cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.domain.Fruita;
import cat.itacademy.barcelonactiva.Leal.Victor.s04.t02.n03.model.services.FruitaService;

@CrossOrigin(origins="http://localhost:8080")
@RestController
public class FruitaController {
	
	@Autowired
	private FruitaService fruitaService;
	
	@GetMapping ("/fruita/getAll")
	public List<Fruita> getAllFruita(){
		
		return fruitaService.getAllFruits();
	}

	@GetMapping ("fruita/getOne/{id}")
	public Fruita getFruita(@PathVariable ("id") int id){
		
		return fruitaService.getFruitaById(id);
	}
	
	@DeleteMapping ("/fruita/delete/{id}")
	public void deleteFruita(@PathVariable ("id") int id) {
		
		fruitaService.delete(id);	
	}
	
	@PostMapping ("/fruita/add")
	public int addFruita(@RequestBody Fruita fruita) {
		
		fruitaService.saveOrUpdate(fruita);
		return fruita.getId();			
	}
	
	@PutMapping ("/fruita/update")
	public int updateFruita(@RequestBody Fruita fruita) {
		
		fruitaService.saveOrUpdate(fruita);
		return fruita.getId();	
	}
}
