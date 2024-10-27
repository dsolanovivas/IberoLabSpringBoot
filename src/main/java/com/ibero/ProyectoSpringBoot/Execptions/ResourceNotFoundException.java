
package com.ibero.ProyectoSpringBoot.Execptions;


public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(String message){
        super(message);
    }
    
}
