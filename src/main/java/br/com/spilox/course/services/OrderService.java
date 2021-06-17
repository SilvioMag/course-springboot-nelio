package br.com.spilox.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spilox.course.entities.Order;
import br.com.spilox.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	
	public Order findById(Integer id) {
		Optional<Order> order = orderRepository.findById(id);
		
		if (! order.isPresent()) {
			return null;
		}
		
		return order.get();
	}
}
