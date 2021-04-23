package com.myr.myr.models.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "universidades")
public class Universidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "universidad_id")
	private Integer id;
	
	@Column(name = "universidad_name", length = 50)
	private String name;
	
	@OneToMany(mappedBy = "universidad", fetch = FetchType.LAZY)
	private List<Alumno> alumnos;
	
	public Universidad() {
		alumnos = new ArrayList<Alumno>();
				}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

	
}
