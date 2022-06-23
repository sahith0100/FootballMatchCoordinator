package com.loginregister.loginregisterspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loginregister.loginregisterspring.model.User;
@Repository

public interface UserRepository extends JpaRepository<User,Long> {


}
