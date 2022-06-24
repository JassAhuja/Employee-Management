package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.DishesDomain;
import com.example.repository.DishesRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DishesController {

	@Autowired
	DishesRepository dishesRepository;
	
	@GetMapping("/getdishes")
	public List<DishesDomain> getDishesDomains(){
		return (List<DishesDomain>) dishesRepository.findAll();
}
//		
//		@PostMapping("/add_dishes")
//		public DishesDomain addDishes (@RequestBody DishesDomain dishes) 
//		{
//			return dishesRepository.save(dishes);
//					}
//		
//		
//		@DeleteMapping("/delete_dishes/{id}")
//		public boolean deleteDishes (@PathVariable int id) {
//			try {
//				dishesRepository.deleteById(id);
//			return true;
//			}catch(Exception e) {
//				e.printStackTrace();
//				return false;
//			}
//		}
//	
//	@PutMapping("/update_dishes")
//			public DishesDomain updateDishes(@RequestBody DishesDomain dishesDomain) {
//				Optional<DishesDomain> dishes= dishesRepository.findById(dishesDomain.getId());
//				return (dishes.isPresent()) ? dishesRepository.save(dishesDomain):null; 
//				
//	}
}