package com.hcl.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String Id;
	private String taskName;
	private String description;
	private String status;
	
	
	
}
