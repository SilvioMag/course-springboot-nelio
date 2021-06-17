package br.com.spilox.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spilox.course.entities.User;
import br.com.spilox.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		
		if (! user.isPresent()) {
			return null;
		}
		
		return user.get();
		
		
	}
}
