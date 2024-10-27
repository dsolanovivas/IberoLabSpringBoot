
package com.ibero.ProyectoSpringBoot.Repositories;

import com.ibero.ProyectoSpringBoot.Models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
    
}
