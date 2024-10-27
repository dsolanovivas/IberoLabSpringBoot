
package com.ibero.ProyectoSpringBoot.Repositories;

import com.ibero.ProyectoSpringBoot.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
