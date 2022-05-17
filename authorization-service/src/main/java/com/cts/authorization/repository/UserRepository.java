package com.cts.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.authorization.model.User;

/**
 * Repository for User
 * 
 * @author Nagaraja
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
