package com.github.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
