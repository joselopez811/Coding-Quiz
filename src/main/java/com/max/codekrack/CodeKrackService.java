package com.max.codekrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.max.codekrack.databaseutil.DatabaseUtil;
import com.max.codekrack.user.User;

@RestController
@RequestMapping(value="/api")
public class CodeKrackService {

	@Autowired
	User user;

	
	@RequestMapping(value="/addQuestion", method = RequestMethod.POST, consumes = "application/json")
	public void gethrmessage(@RequestParam String incomingData) {
		System.out.println(incomingData);
        
        // return HTTP response 200 in case of success
       
    }
	
	@RequestMapping(value="/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Question[] get() {
		Question[] questions = {new Question(), new Question(), new Question(), new Question(), new Question()};
		return questions;
		
	}
	
	@RequestMapping(value="/score", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void incrementScore() {
		user.incrementScore();
	}

}
