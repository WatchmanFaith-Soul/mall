package com.sssxinhui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import top.sssxinhui.entitys.Score;
import top.sssxinhui.entitys.Student;
import top.sssxinhui.unitl.SessionY;

public class TestMain {
	Session session;
	@Before
	public void test1(){
		session = SessionY.getSessionY().getSession();
		session.beginTransaction();
	}
	@After
	public void test2(){
		session.getTransaction().commit();
	}
	@Test
	public void addStudent() throws IOException{
		
		Student s = new Student();
		
		s.setName("tt");
		
		HashSet<Score> ss = new HashSet<Score>();
		Score score = new Score();
		Score score2 = new Score();
		Score score3 = new Score();
		score.setCourse(98);
		score.setCourseName("yuwen");
		score2.setCourse(89);
		score2.setCourseName("shuxue");
		score3.setCourse(76);
		score3.setCourseName("yingyu");
		ss.add(score);
		ss.add(score3);
		ss.add(score2);
		s.setScore(ss);
		File file = new File("C:/Users/贺新辉/Pictures/psb.jpg");
		FileInputStream in = new FileInputStream(file);
		
		Blob b = Hibernate.getLobCreator(session).createBlob(in, in.available());
		
		s.setPicture(b);
		
		session.save("Student", s);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void allStudent(){
		String sql = "from Score";
		List<Score> list = (List<Score>)session.createQuery(sql).list();
		
		System.out.println(list);
		SimpleTimeZone stz = new SimpleTimeZone(1,"adas");
		String s =stz.getDisplayName(Locale.getAvailableLocales()[0]);
		BitSet bs = new BitSet();
	
		System.out.println(s);
	}
}
