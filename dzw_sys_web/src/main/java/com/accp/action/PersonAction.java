package com.accp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.PersonBiz;
import com.accp.pojo.Person;

@RestController
@RequestMapping("/api/persons")
public class PersonAction {
	
	@Autowired
	private PersonBiz biz;
	
	@GetMapping
	public List<Person> getPersonList(){
		return biz.findAll();
	}

}
