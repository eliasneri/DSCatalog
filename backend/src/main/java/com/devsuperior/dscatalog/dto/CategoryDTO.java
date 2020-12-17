package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

import java.time.Instant;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Instant create;
	private Instant update;
	
	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.create =entity.getCreated_At();
		this.update = entity.getUpdateAt();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreate() {
		return create;
	}

	
	public Instant getUpdate() {
		return update;
	}

	
	
	

}
