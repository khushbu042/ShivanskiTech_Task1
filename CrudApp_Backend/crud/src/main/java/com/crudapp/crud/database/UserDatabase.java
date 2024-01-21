package com.crudapp.crud.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.crud.model.User;

public interface UserDatabase extends JpaRepository<User, Long>{

}
