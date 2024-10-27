
package com.ibero.ProyectoSpringBoot.Services;

import com.ibero.ProyectoSpringBoot.Models.User;
import java.util.List;


public interface UserService {
    
    List<User> getAllUser();
    
    User getUserById(int id);
    
    User getUserByEmail(String email);
    
    User saveUser(User user);
    
    void deleteUser(int id);
    
}
