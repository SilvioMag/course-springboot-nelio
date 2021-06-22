package br.com.spilox.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spilox.course.entities.Category;
import br.com.spilox.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categories = categoryService.findAll();
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Integer id){
		Category category = categoryService.findById(id);
		
		if (category == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(category);
		
	}
}
