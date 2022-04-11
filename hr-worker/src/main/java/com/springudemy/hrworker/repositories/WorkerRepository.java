package com.springudemy.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springudemy.hrworker.domain.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
