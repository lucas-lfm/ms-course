package com.springudemy.hruser.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springudemy.hruser.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Transactional(readOnly=true)
	Optional<User> findByEmail(String email);
	
}
