package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;
@Service
@Primary  //make this service a higher priority than mock service when we use them in ProduitController( because both of them are imlements the intrface IProduitService)
public class ProduitService implements IProduitService{
	@Autowired
	ProduitRepository produitrepository;

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return this.produitrepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		this.produitrepository.save(produit);
		
	}

	@Override
	public void UpdateProduit(Produit produit) {
		// TODO Auto-generated method stub
		this.produitrepository.save(produit);
		
	}

	@Override
	public void DeleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit=new Produit();
		produit.setId(id);
		this.produitrepository.delete(produit);
		
	}

	
}
