package net.farout.springsecurity.repo;

import net.farout.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
    public Users findByUsername(String username);
}
