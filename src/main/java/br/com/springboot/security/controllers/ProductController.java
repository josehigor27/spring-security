package br.com.springboot.security.controllers;

import br.com.springboot.security.model.product.Product;
import br.com.springboot.security.model.product.ProductRequestDTO;
import br.com.springboot.security.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody @Valid ProductRequestDTO requestProduct){
        Product product = new Product(requestProduct);
        repository.save(product);
        return  ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ArrayList<Product>> getProduct(){
        return ResponseEntity.ok().body((ArrayList<Product>) repository.findAll());
    }
}
