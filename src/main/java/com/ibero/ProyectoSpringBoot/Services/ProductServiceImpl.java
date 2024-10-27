
package com.ibero.ProyectoSpringBoot.Services;

import com.ibero.ProyectoSpringBoot.Execptions.ResourceNotFoundException;
import com.ibero.ProyectoSpringBoot.Models.Product;
import com.ibero.ProyectoSpringBoot.Repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public List<Product> getAllProducts() {
     return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("El producto no fue encontrado"));
    }

    @Override
    public Product saveProduct(Product product) {
        
        if(product.getPrecio() < 0){
            throw new ResourceNotFoundException("El precio del producto no puede ser negativo");
        }
        
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        
        productRepository.deleteById(id);
    }
    
}
