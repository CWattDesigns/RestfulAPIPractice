package com.myfirstapp.app.rest.Repo;

import com.myfirstapp.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<User, Long> {
}
