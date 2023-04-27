package com.pfa.quickLinker.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.repository.RoleRepository;
import com.pfa.quickLinker.repository.UserRepository;


@Transactional
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserRepository userRepository;
	 
	@Autowired
	RoleRepository roleRepository;
	
	/*
	  @Autowired
	 
	BCryptPasswordEncoder bCryptPasswordEncoder;
	*/
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

	@Override
	public Role addRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUser(String username, String roleName) {
		User u=userRepository.findByUsername(username);
		Role r=roleRepository.findByRole(roleName);
		
		u.getRoles().add(r);
		userRepository.save(u);
		return u;
	}

}
