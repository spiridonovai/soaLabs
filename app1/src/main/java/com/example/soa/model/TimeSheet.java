package com.example.soa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "timesheet")
public class TimeSheet extends BaseEntity {

	@ManyToOne
	public User user;

	public Date date;

	@Column(nullable = false)
	public float hours;

	public TimeSheet() {
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}
}
