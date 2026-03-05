package com.qwerty.demo.Service;
import com.qwerty.demo.Model.Product;
import com.qwerty.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId)
                .orElseThrow(()-> new RuntimeException("product not found"));
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }


    public List<Product> getProductsByPriceLessThan(double price) {
        return repo.findProductsByPriceLessThan(price);
    }
}
