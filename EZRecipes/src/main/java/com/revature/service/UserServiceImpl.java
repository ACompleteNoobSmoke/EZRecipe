package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.revature.model.User;
=======
import com.revature.model.Ingredient;
>>>>>>> 698738e061322b43f2a0675ff9bada3371cca0c0
import com.revature.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	//dependency
	private UserRepository userRepository;

	//constructor injection
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	//setter injection
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
<<<<<<< HEAD
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}
=======

	public List<Ingredient> getPantryById(int userid) {
		List<Ingredient> pantry = userRepository.getUserById(userid).getPantry();
		return pantry;
	}

>>>>>>> 698738e061322b43f2a0675ff9bada3371cca0c0
}
