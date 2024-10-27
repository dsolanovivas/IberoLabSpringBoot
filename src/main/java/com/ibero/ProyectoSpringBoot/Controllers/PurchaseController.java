
package com.ibero.ProyectoSpringBoot.Controllers;

import com.ibero.ProyectoSpringBoot.Models.Purchase;
import com.ibero.ProyectoSpringBoot.Services.PurchaseServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
    
    @Autowired
    private PurchaseServiceImpl purchaseServiceImpl;
    
    @GetMapping
    public List<Purchase> getAllPurchase(){
        return purchaseServiceImpl.getAllPurchase();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Purchase> getPurchaseById(@PathVariable int id){
        Purchase purchase = purchaseServiceImpl.getPurchaseById(id);
        if(purchase != null){
            return new ResponseEntity<>(purchase, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping
    public Purchase createPurchase(@RequestBody Purchase purchase){
        return purchaseServiceImpl.savePurchase(purchase);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePurchase(@PathVariable int id){
        purchaseServiceImpl.deletePurchase(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
