package com.myr.myr.models.entities;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_n_mz")
public class TipoNMz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tiponmz_id")
	private Integer id;
	
	@Column(name = "tiponmz_name", length = 10)
	private String name;
	
	@OneToMany(mappedBy = "tiponmz", fetch = FetchType.LAZY)
	private List<Propiedad> propiedades;
	
	public TipoNMz() {
		propiedades = new ArrayList<Propiedad>();
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

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	
	

}
