package com.example.tareadoce.repository;
import com.example.tareadoce.controller.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findById(int id);
    List<User> findByName(String name);
    List<User> findByUser(String user);
    List<User> findByAge(int age);
    List<User> findByPas(int pas);
}