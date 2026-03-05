package com.qwerty.demo.Repository;

import com.qwerty.demo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findProductsByPriceLessThan(double amount);
}
