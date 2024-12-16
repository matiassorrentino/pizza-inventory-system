package com.pizza.inventory.controller;

import com.pizza.inventory.model.Product;
import com.pizza.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products") // Prefijo principal
public class ProductController {

    @Autowired
    private ProductService service;

    // Obtener todos los productos
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    // Obtener un producto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = service.getAllProducts()
                .stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con ID: " + id));

        return ResponseEntity.ok(product);
    }

    // Agregar un nuevo producto
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    // Actualizar un producto existente
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product updatedProduct = service.updateProduct(id, productDetails);
        return ResponseEntity.ok(updatedProduct);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.ok().build();
    }

    // Contar la cantidad total de productos
    @GetMapping("/utils/count")
    public long getTotalProducts() {
        return service.getTotalProducts();
    }

    // Obtener el stock total de todos los productos
    @GetMapping("/utils/stock")
    public Long getTotalStock() {
        return service.getTotalStock();
    }
}
