package com.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class QuestionMap {
	
	@Id
	private int qId;
	private String q;
	
	@OneToOne
	@JoinColumn(name="a_id")
	Answer ans;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	public QuestionMap(int qId, String q, Answer ans) {
		super();
		this.qId = qId;
		this.q = q;
		this.ans = ans;
	}

	public QuestionMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
