package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.Task;


@Repository
@RequestMapping("/Task")
public interface TaskRepository extends CrudRepository<Task, String> {

}
