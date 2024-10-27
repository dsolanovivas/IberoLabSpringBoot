
package com.ibero.ProyectoSpringBoot.Services;

import com.ibero.ProyectoSpringBoot.Models.Purchase;
import java.util.List;


public interface PurchaseService {
    
    List<Purchase> getAllPurchase();
    
    Purchase getPurchaseById(int id);
    
    Purchase savePurchase(Purchase purchase);
    
    void deletePurchase(int id);
}
