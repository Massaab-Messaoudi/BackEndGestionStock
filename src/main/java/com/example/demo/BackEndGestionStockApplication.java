
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@SpringBootApplication
public class BackEndGestionStockApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BackEndGestionStockApplication.class, args);
		/*ProduitRepository produitrepository=ctx.getBean(ProduitRepository.class);
		// create and instances of produit in the data base
		produitrepository.save(new Produit("Livre",50,20f));
		produitrepository.save(new Produit("Cahier",200,5.20f));
		produitrepository.save(new Produit("Stylo",150,10f));*/
	}

}
