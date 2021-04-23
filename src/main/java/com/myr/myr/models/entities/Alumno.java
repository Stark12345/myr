package com.myr.myr.models.entities;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;







@Entity
@Table(name = "alumnos")
public class Alumno { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alumno_id")
	private Integer id;
	
	@Column(name = "alumno_name", length = 25)
	private String name;
	
	@Column(name = "alumno_dni",columnDefinition = "NUMERIC(8)")
	private Integer dni;
	
	@Column(name = "alumno_mail", length = 30)
	private String mail;
	
	@Column(name = "alumno_psword", length = 12)
	private String psword;
	
	@Column(name = "alumno_born")
	@Temporal(TemporalType.DATE)
	private Date born;
	
	@ManyToOne
	@JoinColumn(name = "universidad_id", nullable = false)	
	private Universidad universidad; 
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "alumno_intereses", 
			joinColumns = { @JoinColumn(referencedColumnName = "alumno_id", name = "alumno_id") },
			inverseJoinColumns = {@JoinColumn(referencedColumnName = "interes_id", name = "interes_id")})
	private List<Interes> intereses;
	
	@OneToMany(mappedBy = "alumno", fetch = FetchType.LAZY)
	private List<Alquiler> alquileres;
	
	public Alumno() {
		alquileres = new ArrayList<Alquiler>();
		intereses = new ArrayList<Interes>();
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

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPsword() {
		return psword;
	}

	public void setPsword(String psword) {
		this.psword = psword;
	}

	public Date getBorn() {
		return born;
	}

	public void setBorn(Date born) {
		this.born = born;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public List<Interes> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<Interes> intereses) {
		this.intereses = intereses;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
}
