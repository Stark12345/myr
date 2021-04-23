package com.myr.myr.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "habitacion_id")
	private Integer id;
	
	@Column(name = "habitacion_limit_people", columnDefinition = "NUMERIC(6)")
	private Integer limit_people;
	
	@Column(name = "habitacion_size", columnDefinition = "NUMERIC(6)")
	private Integer size;
	
	@Column(name = "habitacion_description", length = 100)
	private String description;
	
	@Column(name = "habitacion_costo_total", columnDefinition = "NUMERIC(6)")
	private Integer costo_total;
	
	@ManyToOne
	@JoinColumn(name = "propiedad_id", nullable = false)	
	private Propiedad propiedad; 
	
	@OneToMany(mappedBy = "habitacion", fetch = FetchType.LAZY)
	private List<Alquiler> alquileres;
	
	
	public Habitacion() {
		alquileres = new ArrayList<Alquiler>();	
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getLimit_people() {
		return limit_people;
	}


	public void setLimit_people(Integer limit_people) {
		this.limit_people = limit_people;
	}


	public Integer getSize() {
		return size;
	}


	public void setSize(Integer size) {
		this.size = size;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getCosto_total() {
		return costo_total;
	}


	public void setCosto_total(Integer costo_total) {
		this.costo_total = costo_total;
	}


	public Propiedad getPropiedad() {
		return propiedad;
	}


	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}


	public List<Alquiler> getAlquileres() {
		return alquileres;
	}


	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
	
}
