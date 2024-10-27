
package com.ibero.ProyectoSpringBoot.Services;

import com.ibero.ProyectoSpringBoot.Models.Purchase;
import com.ibero.ProyectoSpringBoot.Repositories.PurchaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository PurchaseRepository;
    
    @Override
    public List<Purchase> getAllPurchase() {
        return PurchaseRepository.findAll();
    }

    @Override
    public Purchase getPurchaseById(int id) {
        return PurchaseRepository.findById(id).orElse(null);
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        return PurchaseRepository.save(purchase);
    }

    @Override
    public void deletePurchase(int id) {
        PurchaseRepository.deleteById(id);
    }
    
}
