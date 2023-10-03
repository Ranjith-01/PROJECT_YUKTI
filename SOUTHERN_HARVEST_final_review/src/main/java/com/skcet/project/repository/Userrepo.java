package com.skcet.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.skcet.project.model.Users;

public interface Userrepo extends JpaRepository<Users, Integer> {

}
