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
@Table(name = "propiedades")
public class Propiedad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propiedad_id")
	private Integer id;
	
	@Column(name = "propiedad_name", length = 60)
	private String name;
	
	@Column(name = "propiedad_n_mz", length = 10)
	private String n_mz;

	@Column(name = "propiedad_n_interior", length = 10)
	private String n_interior;
	
	@ManyToOne
	@JoinColumn(name = "distrito_id", nullable = false)	
	private Distrito distrito; 
	
	@ManyToOne
	@JoinColumn(name = "tipo_interior_id", nullable = false)	
	private TipoInterior tipointerior; 
	
	@ManyToOne
	@JoinColumn(name = "tiponmz_id", nullable = false)	
	private TipoNMz tiponmz; 
	
	@ManyToOne
	@JoinColumn(name = "tipo_via_id", nullable = false)	
	private TipoVia tipovia; 
	
	@ManyToOne
	@JoinColumn(name = "propietario_id", nullable = false)	
	private Propietario propietario; 
	
	@OneToMany(mappedBy = "propiedad", fetch = FetchType.LAZY)
	private List<Habitacion> habitaciones;
	
	public Propiedad() {
		habitaciones = new ArrayList<Habitacion>();
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

	public String getN_mz() {
		return n_mz;
	}

	public void setN_mz(String n_mz) {
		this.n_mz = n_mz;
	}

	public String getN_interior() {
		return n_interior;
	}

	public void setN_interior(String n_interior) {
		this.n_interior = n_interior;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public TipoInterior getTipointerior() {
		return tipointerior;
	}

	public void setTipointerior(TipoInterior tipointerior) {
		this.tipointerior = tipointerior;
	}

	public TipoNMz getTiponmz() {
		return tiponmz;
	}

	public void setTiponmz(TipoNMz tiponmz) {
		this.tiponmz = tiponmz;
	}

	public TipoVia getTipovia() {
		return tipovia;
	}

	public void setTipovia(TipoVia tipovia) {
		this.tipovia = tipovia;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	
	
	
}
