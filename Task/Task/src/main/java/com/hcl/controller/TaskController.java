package com.hcl.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.hcl.service.TaskService;
import com.hcl.entity.Task;

@RestController
@RequestMapping("/Task")
public class TaskController {

	@Autowired
	TaskService taskService;

	
	//saving a specific record
	@PostMapping("/addDetails")
	public String addTaskDetails(@RequestBody Task task) {

		String addStatus = taskService.addTaskDetails(task);

		return addStatus;
	}
	
	//creating a get mapping that retrieves the detail of a specific task
	@GetMapping("/findTaskById/{Id}")
		public Task getTaskDetails(@PathVariable String Id) {
		
		Task task = taskService.getTaskDetails(Id);
		
		return task;
		
		
	}
	
	//creating a delete mapping that deletes a specified task
	@DeleteMapping("/{id}")  
	private String deleteBook(@PathVariable("id") String id)   
	{  
		String Status = taskService.delete(id);  
		return Status;
	}  
	
	//creating a get mapping that retrieves all the task from database
	@GetMapping("/AllTask")  
	private List<Task> getAllTasks()   
	{  
	return taskService.getAllTasks();  
	} 
	
	
	//creating put mapping that updates the task detail  
	@PutMapping("/UpdateTask")  
	private Task update(@RequestBody Task task)   
	{  
		taskService.addTaskDetails(task);  
	return task;  
	} 
	
}
