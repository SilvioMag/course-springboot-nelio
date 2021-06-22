package br.com.spilox.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spilox.course.entities.Product;
import br.com.spilox.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product> product = productRepository.findById(id);
		
		if (! product.isPresent()) {
			return null;
		}
		
		return product.get();
		
		
	}
}
