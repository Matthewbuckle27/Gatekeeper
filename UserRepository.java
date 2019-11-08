package com.hcl.Hackathon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.Hackathon.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
@Query(value="select username from user where role =:mathew",nativeQuery=true)
public List<String> userquery(@Param("mathew")String role);


@Query(value="select userid from user where username =:mathew",nativeQuery=true)
public String findId(@Param("mathew")String name);


}
