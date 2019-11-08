package com.hcl.Hackathon.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.Hackathon.model.Ticket;
@Repository
public interface GateKeeperTicketRepository extends CrudRepository<Ticket, Integer>{
	
@Query(value="select * from ticket where status =:mathew",nativeQuery=true)
public List<Ticket> nativequery(@Param("mathew")String status);

public Ticket findById(int id);

}
