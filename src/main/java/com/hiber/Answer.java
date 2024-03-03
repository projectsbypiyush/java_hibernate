package com.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int ansId;
	private String ans;
	
	@OneToOne(mappedBy = "ans")
	QuestionMap question;
	
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAns() {
		return ans;
	}
	public QuestionMap getQuestion() {
		return question;
	}
	public void setQuestion(QuestionMap question) {
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int ansId, String ans) {
		super();
		this.ansId = ansId;
		this.ans = ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
}
