package com.harbourxquizapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResultData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rId;
	private double marksGot;
	private Long attempted;
	private Long correctAnswers;
	private String username;
	private String email;
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMarksGot() {
		return marksGot;
	}
	public void setMarksGot(double marksGot) {
		this.marksGot = marksGot;
	}
	public Long getAttempted() {
		return attempted;
	}
	public void setAttempted(Long attempted) {
		this.attempted = attempted;
	}
	public Long getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(Long correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	
}
