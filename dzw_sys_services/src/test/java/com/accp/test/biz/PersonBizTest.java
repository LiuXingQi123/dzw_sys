package com.accp.test.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.PersonBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class PersonBizTest {
	@Autowired
	private PersonBiz biz;
	
	@Test
	public void testFindAll() {
		biz.findAll();
	}

}
