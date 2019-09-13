package com.max.codekrack;

public class Answer {
	
	private int id;
	private String answer;
	private int answerId;
	
	public Answer(int id, String answer, int answerId) {
		this.id = id;
		this.answer = answer;
		this.answerId = answerId;
		System.out.println(answerId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
}
