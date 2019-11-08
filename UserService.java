package com.hcl.Hackathon.service;

import java.util.List;

import com.hcl.Hackathon.model.User;


public interface UserService {
	
	public List<String> userquery();
	public String findbyId(String name);

}
