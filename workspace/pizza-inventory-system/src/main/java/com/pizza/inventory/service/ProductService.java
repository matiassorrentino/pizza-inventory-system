package com.pizza.inventory.service;

import com.pizza.inventory.model.Product;
import com.pizza.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Listar todos los productos
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // Agregar un nuevo producto
    public Product addProduct(Product product) {
        return repository.save(product);
    }

    // Actualizar un producto existente
    public Product updateProduct(Long id, Product productDetails) {
        Optional<Product> optionalProduct = repository.findById(id);

        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();
            existingProduct.setName(productDetails.getName());
            existingProduct.setPrice(productDetails.getPrice());
            existingProduct.setStock(productDetails.getStock());
            existingProduct.setDescription(productDetails.getDescription());

            return repository.save(existingProduct);
        } else {
            throw new RuntimeException("Producto no encontrado con ID: " + id);
        }
    }

    // Eliminar un producto
    public void deleteProduct(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Producto no encontrado con ID: " + id);
        }
    }

    // Contar la cantidad total de productos
    public long getTotalProducts() {
        return repository.count();
    }

    // Obtener el stock total de todos los productos
    public Long getTotalStock() {
        return repository.findAll()
                .stream()
                .mapToLong(Product::getStock)
                .sum();
    }
}
