package com.springudemy.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springudemy.hrworker.domain.Worker;
import com.springudemy.hrworker.repositories.WorkerRepository;
import com.springudemy.hrworker.services.exceptions.ObjectNotFoundException;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> findAll(){
		return workerRepository.findAll();
	}
	
	public Worker find(Long id){
		Optional<Worker> obj = workerRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + Worker.class.getName()));
	}

}
