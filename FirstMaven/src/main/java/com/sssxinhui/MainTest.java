package com.sssxinhui;

import org.hibernate.Session;

public class MainTest {
	public static void main(String[] args) {
		Session session = SessionY.getSession();
		
		User user = new User();
		
		user.setAge(34);
		user.setName("��jingjing1");
		
		
		session.beginTransaction();
		
		session.save(user);

		session.getTransaction().commit();
		
		SessionY.closeF();
	}
}
