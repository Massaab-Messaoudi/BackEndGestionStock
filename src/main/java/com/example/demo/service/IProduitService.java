package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Produit;

public interface IProduitService {
   List<Produit> getProduits();
   void addProduit(Produit produit);
   void UpdateProduit(Produit produit);
   void DeleteProduit(String ref);
}
