package com.qwerty.demo.Controller;

import com.qwerty.demo.Model.Product;
import com.qwerty.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService prodservice;
    @RequestMapping("/products")
    List<Product> getProducts(){
        return prodservice.getProducts();
    }

    @GetMapping("/products/{prodId}")
    Product getProductById(@PathVariable int prodId){
        return prodservice.getProductById(prodId);

    }

    @PostMapping("/Products")
    void addProducts(@RequestBody Product prod){
        prodservice.addProduct(prod);
    }

   @PutMapping("/products")
    void updateProduct(@RequestBody Product prod){
        prodservice.updateProduct(prod);
    }

    @DeleteMapping("Products/{prodId}")
    void deleteProduct(@PathVariable int prodId){
        prodservice.deleteProduct(prodId);
    }
    @GetMapping("products/lessThan/{price}")
    List<Product> getProductsByPriceLessThan(@PathVariable double price){
        return prodservice.getProductsByPriceLessThan(price);
    }

}
