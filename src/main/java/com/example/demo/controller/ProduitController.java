package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Produit;
import com.example.demo.service.IProduitService;
import com.example.demo.service.ProduitService;
@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ProduitController {
@Autowired	
private IProduitService produitService;	

@GetMapping("/")
public String login() 
{
	return "logged successfully";
}
@GetMapping("/api/produit")
public List<Produit> getProduits() 
{

	return produitService.getProduits();
}
@PostMapping
public void addProduit(@RequestBody Produit produit) 
{
    this.produitService.addProduit(produit);
}

@PutMapping
public void UpdateProduit(@RequestBody Produit produit) 
{
    this.produitService.UpdateProduit(produit);
}

@DeleteMapping("/{id}")
public void DeleteProduit(@PathVariable Long id) 
 {
	
    produitService.DeleteProduit(id);	
    
 }

}