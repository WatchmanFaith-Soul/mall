package com.sssxinhui;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMain {
	Session session = SessionY.getSession();
	@Before
	public void test1(){
		
		session.beginTransaction();
	}
	@After
	public void test2(){
		session.getTransaction().commit();
	}
	@Test
	public void addStudent(){
		
		
	}
}
