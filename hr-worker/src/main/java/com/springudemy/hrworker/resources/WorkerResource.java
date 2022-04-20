package com.springudemy.hrworker.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springudemy.hrworker.domain.Worker;
import com.springudemy.hrworker.services.WorkerService;

@RefreshScope
@RestController
@RequestMapping(value="/workers")
public class WorkerResource {

	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
//	@Value("${test.config}")
//	private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping(value="/configs")
	public ResponseEntity<Void> getConfigs(){
		//logger.info("CONGIG = "+testConfig);
		return ResponseEntity.noContent().build();		
	}
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Worker> find(@PathVariable Long id){
		
		/*
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		logger.info("PORT = "+env.getProperty("local.server.port"));
		
		Worker obj = workerService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
