package com.max.codekrack.user;

import org.springframework.stereotype.Component;

@Component
public class User {
 
    private int id;
 
    private String username;
 
    private String password;
    
    private int score;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", score=" + score + "]";
	}
	
	public User() {}
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.score = 0;
	}
	public User(int id, String username, String password, int score) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public int incrementScore() {
		this.score++;
		return this.score;
	}
    
    // standard getters and setters
}
