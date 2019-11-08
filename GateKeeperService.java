package com.hcl.Hackathon.service;

import java.util.List;

import com.hcl.Hackathon.model.Ticket;

public interface GateKeeperService {
	public List<Ticket> getAllTickets();

	public void updateTicket(Ticket ticket);
	
	 public List<Ticket> nativequery();
	 public Ticket findById(int id);
	 
	 public Ticket saveTicket(Ticket ticket);

	 
	 
}
