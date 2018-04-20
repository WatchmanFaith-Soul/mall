package top.sssxinhui.webs;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import top.sssxinhui.dao.SessionY;
import top.sssxinhui.entitys.Home;
@WebServlet("/testsevrlet")
public class TestSevrlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		<form action="" method="post">
//		<input name="name"></input>
//		<input name="isBook"></input>
//	
//		<input name="adderss"></input>
//		<input name="deses"></input>
//	</form>
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		Integer isBook = Integer.valueOf(req.getParameter("isBook"));
		String adderss = req.getParameter("adderss");
		String deses = req.getParameter("deses");
		System.out.println(name+isBook+adderss+deses);
		Session session = SessionY.getSession();
		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Home.class);
		
		Criterion c1 =  Restrictions.eq("name", name);
		Criterion c2 =  Restrictions.eq("isbook", isBook);
		Criterion c3 =  Restrictions.eq("addess", adderss);
		Criterion c4 =  Restrictions.eq("deses", deses);
		
		if (name != null && name.length() != 0){
			criteria.add(c1);
		}
		if (isBook == 1 ){
			criteria.add(c2);		
		}
		if (adderss != null && adderss.length() != 0){
			criteria.add(c3);
		}
		if (deses != null && deses.length() != 0){
			criteria.add(c4);
		}
		
		@SuppressWarnings("unchecked")
		List<Home> list = criteria.list();
		for (Home home : list) {
			System.out.println(home);
		}
		session.getTransaction();
		
	}
}
