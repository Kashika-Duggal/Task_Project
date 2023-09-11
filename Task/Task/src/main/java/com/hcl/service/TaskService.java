package com.hcl.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.repository.TaskRepository;
import com.hcl.entity.Task;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	//saving a specific record
	public String addTaskDetails(Task task) {
		
		
		taskRepository.save(task);
		
		return "Task added Successfully";
		
	}
	
	//getting a specific record by using the method findById()
	public Task getTaskDetails(String Id) {
		
		Optional<Task> task = taskRepository.findById(Id);
		
		if(task.isPresent()) {
			return task.get();
		}
		return null;
		
	}
	
	//deleting a record 
	public String delete(String Id)   
	{  
		taskRepository.deleteById(Id);  
		
		return "Task deleted Successfully";
	}  
	
	//getting all record by using the method findaAll() 
	public List<Task> getAllTasks()   
	{  
	List<Task> task = new ArrayList<Task>();  
	taskRepository.findAll().forEach(task1 -> task.add(task1));  
	return task;  
	}
	
	//updating a record 
	public void update(Task task, String Id)   
	{  
		taskRepository.save(task);  
	}
	
	

}
