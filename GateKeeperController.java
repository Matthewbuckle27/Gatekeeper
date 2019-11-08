package com.hcl.Hackathon.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.Hackathon.model.Ticket;
import com.hcl.Hackathon.model.User;
import com.hcl.Hackathon.service.GateKeeperService;
import com.hcl.Hackathon.service.UserService;

@RestController
public class GateKeeperController {
	@Autowired
	public GateKeeperService ticketService;

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/getAll")
	public ModelAndView ReadAll() {

		List<Ticket> tickets = ticketService.getAllTickets();
		for (Iterator<Ticket> iterator = tickets.iterator(); iterator.hasNext();) {
			Ticket ticket = (Ticket) iterator.next();
			System.out.println(ticket);
		}
		ModelAndView map1 = new ModelAndView("GateKeeperJSP");
		map1.addObject("tickets", tickets);
		return map1;

	}

	@RequestMapping(value = "/viewTicket/{id}")
	public ModelAndView getUserById(@PathVariable("id") int id) {

		Ticket ticket = ticketService.findById(id);
		List<String> teamMember = new ArrayList<String>();
		teamMember = userService.userquery();
		ModelAndView model = new ModelAndView("gatekeeperUpdate");
		model.addObject("ticket", ticket);
		model.addObject("team", teamMember);
		return model;

	}

	@RequestMapping(value = "/update")
	public ModelAndView update(@RequestParam("status") String status, @RequestParam("id") String id,
			@RequestParam("description") String description, @RequestParam("contactNo") String contactNo,
			@RequestParam("workLocation") String workLocation, @RequestParam("priority") String priority,
			@RequestParam("userId") String userId, @RequestParam("typeOfTicket") String typeOfTicket,
			@RequestParam("assign") String assign) {
		System.out.println(Integer.parseInt(id));
		System.out.println(assign);
		Ticket ticket = new Ticket();
		ticket.setContact(contactNo);
		ticket.setDescription(description);
		ticket.setId(Integer.parseInt(id));
		ticket.setLocation(workLocation);
		ticket.setPriority(priority);
		ticket.setStatus(status);
		ticket.setUserId(userId);
		ticket.setAssign(userService.findbyId(assign));
		ticket.setType(typeOfTicket);
		System.out.println(ticket);
		Ticket ticket1 = ticketService.saveTicket(ticket);
		ModelAndView model = new ModelAndView("GateKeeperJSP");
		List<Ticket> tickets = ticketService.nativequery();
		model.addObject("tickets", tickets);
		return model;

	}

	@RequestMapping(value = "/getPath")
	public ModelAndView getAllNative() {

		List<Ticket> tickets = ticketService.nativequery();
		for (Iterator<Ticket> iterator = tickets.iterator(); iterator.hasNext();) {
			Ticket ticket = (Ticket) iterator.next();
			System.out.println(ticket);
		}

		List<String> teamMember = new ArrayList<String>();
		teamMember = userService.userquery();
		System.out.println("ArrayList : " + teamMember);
		ModelAndView model = new ModelAndView("GateKeeperJSP");
		model.addObject("tickets", tickets);
		model.addObject("team", teamMember);
		return model;

	}

	@RequestMapping(value = "/create")
	public ModelAndView create() {

		ModelAndView map1 = new ModelAndView("NewCompliant");

		return map1;
	}

}
