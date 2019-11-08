package com.hcl.Hackathon.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Hackathon.dao.UserRepository;
import com.hcl.Hackathon.model.User;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;


	@Override
	public List<String> userquery() {
		return userRepository.userquery("team member");
	}


	@Override
	public String findbyId(String name) {
		return userRepository.findId(name);
	}

	
	
	
}



