package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.PersonMapper;
import com.accp.pojo.Person;

@Service
public class PersonBiz {
	
	@Autowired
	private PersonMapper dao;
	
	public List<Person> findAll(){
		return dao.queryAll();
	}
}
