package com.pfa.quickLinker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.quickLinker.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByRole(String role);

}
