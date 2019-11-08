package com.hcl.Hackathon.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Hackathon.dao.GateKeeperTicketRepository;
import com.hcl.Hackathon.model.Ticket;


@Service
public class GateKeeperServiceImpl implements GateKeeperService {
	@Autowired
	private GateKeeperTicketRepository ticketRepository;

	@Transactional
	@Override
	public List<Ticket> getAllTickets() {

		return (List<Ticket>) ticketRepository.findAll();
	}

	@Override
	public void updateTicket(Ticket ticket) {
		ticketRepository.save(ticket);
		
	}
	
	@Override
	public List<Ticket> nativequery() {
		return ticketRepository.nativequery("new");
	}

	@Transactional
	@Override
	public Ticket findById(int id) {
		return ticketRepository.findById(id);
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	
	
}



