package com.harbourxquizapp.model;

import java.util.List;

public class MarksEvalVO {
private List<Questions> questions;
private String username;
public List<Questions> getQuestions() {
	return questions;
}
public void setQuestions(List<Questions> questions) {
	this.questions = questions;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
