package com.hcl.Hackathon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "typeOfTicket")
	private String type;
	@Column(name = "description")
	private String description;
	@Column(name = "contactNo")
	private String contact;
	@Column(name = "workLocation")
	private String location;
	@Column(name = "status")
	private String status;
	@Column(name = "priority")
	private String priority;
	@Column(name = "userId")
	private String userId;
	@Column(name = "assign")
	private String assign;

	public Ticket() {
		super();
	}

	public Ticket(int id, String type, String description, String contact, String location, String status,
			String priority, String userId, String assign) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.contact = contact;
		this.location = location;
		this.status = status;
		this.priority = priority;
		this.userId = userId;
		this.assign = assign;
	}

	public String getAssign() {
		return assign;
	}

	public void setAssign(String assign) {
		this.assign = assign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", type=" + type + ", description=" + description + ", contact=" + contact
				+ ", location=" + location + ", status=" + status + ", priority=" + priority + ", userId=" + userId
				+ ", assign=" + assign + "]";
	}



}
