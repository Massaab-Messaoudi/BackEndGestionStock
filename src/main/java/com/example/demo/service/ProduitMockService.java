package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
@Service
public class ProduitMockService implements IProduitService{
    private List<Produit> produits;
    
    public ProduitMockService() 
    {
    	this.produits=new ArrayList<Produit>();
    	this.produits.add(new Produit("livre",50,20f));
    	this.produits.add(new Produit("Cahier",200,5.20f));
    	this.produits.add(new Produit("stylo",150,10f));
    }
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		produits.add(produit);
		
	}

	@Override
	public void UpdateProduit(Produit produit) {
		// TODO Auto-generated method stub
		produits.remove(produit);
		produits.add(produit);
		
	}

	
	@Override
	public void DeleteProduit(Long id) {
		
		// TODO Auto-generated method stub
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
		
		
       }


}
