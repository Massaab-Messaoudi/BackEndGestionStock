package com.example.demo.entity;

public class Produit {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
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
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}

	
}
