
package com.ibero.ProyectoSpringBoot.Repositories;

import com.ibero.ProyectoSpringBoot.Models.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
