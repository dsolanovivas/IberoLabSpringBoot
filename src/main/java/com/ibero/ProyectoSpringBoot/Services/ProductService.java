
package com.ibero.ProyectoSpringBoot.Services;

import com.ibero.ProyectoSpringBoot.Models.Product;
import java.util.List;

public interface ProductService {
    
    List<Product> getAllProducts();
    
    Product getProductById(Integer id);
    
    Product saveProduct(Product product);
    
    void deleteProduct(int id);
}
