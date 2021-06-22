package br.com.spilox.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spilox.course.entities.Category;
import br.com.spilox.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		
		if (! category.isPresent()) {
			return null;
		}
		
		return category.get();
		
		
	}
}
