package com.springudemy.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springudemy.hrworker.domain.Worker;
import com.springudemy.hrworker.services.WorkerService;

@RestController
@RequestMapping(value="/workers")
public class WorkerResource {

	@Autowired
	private WorkerService workerService;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Worker> find(@PathVariable Long id){
		Worker obj = workerService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}