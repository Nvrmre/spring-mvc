package com.spring.mvc.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
 
    

}
