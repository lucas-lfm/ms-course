package com.springudemy.hruser.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springudemy.hruser.domain.User;
import com.springudemy.hruser.repositories.UserRepository;
import com.springudemy.hruser.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findByEmail(String email) {
		Optional<User> obj = userRepository.findByEmail(email);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Email: " + email + 
				", Tipo: " + User.class.getName()));
	}
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + User.class.getName()));
	}
	
}
