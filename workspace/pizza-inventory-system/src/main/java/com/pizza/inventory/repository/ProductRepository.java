package com.pizza.inventory.repository;

import com.pizza.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Método para contar la cantidad total de productos
    @Query("SELECT COUNT(p) FROM Product p")
    long countAllProducts();
}
