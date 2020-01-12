package com.kylekprojects.wsidt.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.kylekprojects.wsidt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User>{
	public Page<User> findAll(Pageable pageable);
	public Page<User> findAll (Specification<User> specification, Pageable pageable);
	public User findByUsername(String username);

}