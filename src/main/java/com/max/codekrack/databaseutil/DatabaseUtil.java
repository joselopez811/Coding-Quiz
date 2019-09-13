package com.max.codekrack.databaseutil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.max.codekrack.Answer;

public class DatabaseUtil {
	
	public static int id = 1;

	public static String getQuestion() {
		String sql = "SELECT question FROM test.questions WHERE question_id = " + id;
		incrementId();
		try {
			Statement statement = DbConnect.connection.createStatement();
			statement.executeQuery(sql);
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next())
				return rs.getString("question");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public static String getCode() {
		String sql = "SELECT code FROM test.questions WHERE question_id = " + id;
		
		try {
			Statement statement = DbConnect.connection.createStatement();
			statement.executeQuery(sql);
			ResultSet rs = statement.executeQuery(sql);
			if(rs.next())
				return rs.getString("code");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Answer[] getAnswers() {
		String sql = "SELECT option1, option2, option3, option4, option5, answer_id "
				+ "FROM test.questions WHERE question_id = " + id;
		Answer[] answers = new Answer[5] ;
		try {
			Statement statement = DbConnect.connection.createStatement();
			statement.executeQuery(sql);
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				answers[0] = new Answer(1, rs.getString("option1"), rs.getInt("answer_id"));				
				answers[1] = new Answer(2, rs.getString("option2"), rs.getInt("answer_id"));				
				answers[2] = new Answer(3, rs.getString("option3"), rs.getInt("answer_id"));				
				answers[3] = new Answer(4, rs.getString("option4"), rs.getInt("answer_id"));				
				answers[4] = new Answer(5,  rs.getString("option5"), rs.getInt("answer_id"));				
			}
			return answers;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public static void incrementId() {
		id++;
		System.out.println(id + " = question id");
		if(id > 5)
			id = 1;
		
	}
	public static int getId() {
	
		return id;
	}
}
