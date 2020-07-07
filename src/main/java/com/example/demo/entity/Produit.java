package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ref;
	private int quantitie;
	private float prixunit;
	public Produit(String ref, int quantitie, float prixunit) {
		super();
		this.ref = ref;
		this.quantitie = quantitie;
		this.prixunit = prixunit;
	}
	public Produit() {
		super();
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getQuantitie() {
		return quantitie;
	}
	public void setQuantitie(int quantitie) {
		this.quantitie = quantitie;
	}
	public float getPrixunit() {
		return prixunit;
	}
	public void setPrixunit(float prixunit) {
		this.prixunit = prixunit;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
