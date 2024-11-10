package com.project.mediapp.repos;

import com.project.mediapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Long> {



}
