package com.myr.myr.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "intereses")
public class Interes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interes_id")
	private Integer id;
	
	@Column(name = "interes_name", length = 25)
	private String name;
	
	@ManyToMany(mappedBy = "intereses", fetch = FetchType.LAZY)
	private List<Alumno> alumnos;
	
	public Interes() {
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
