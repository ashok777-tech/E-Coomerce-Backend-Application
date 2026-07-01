package com.ashok.demo.Controller;
 import com.ashok.demo.Model.Product;
 import com.ashok.demo.Service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductCotroller {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){
    return service.getProducts();
    }
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
       return  service.getProductById(productId);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);
    }
     @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        System.out.println("here update");
        service.updateProduct(product);
    }
       @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
}
}
