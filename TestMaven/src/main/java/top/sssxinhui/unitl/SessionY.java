package top.sssxinhui.unitl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



import org.hibernate.service.ServiceRegistry;

@SuppressWarnings({ "deprecation", "unused" })
public class SessionY {
	private static SessionY sy = null;
	private SessionY(){}
	public static SessionY getSessionY(){
		if (sy == null) {
			return new SessionY();
		} else {
			return sy;
		}
	}
	private  SessionFactory factory = null;

	
	@SuppressWarnings("deprecation")
	public  Session getSession() {

		if (factory == null) {

			// 使用hibernate

			// hibernate中使用session对象操作数据库

			// 1初始化一个包含配置数据的对象
			// 直接new 一个对象，并不包括配置信息，必须调用configure方法
			// configure方法中回去读取hibernate.cfg中的数据。使用的是dom4j。结果有数据库常量还有映射文件的数据
			Configuration con = new Configuration().configure();

			// 2注册配置文件，可以理解是刚才通过Configuration读取出来的内容生效
			@SuppressWarnings("deprecation")
			ServiceRegistryBuilder buider = new ServiceRegistryBuilder();

			// applySettings 是设置生效，设置的内容就是con里的配置信息，配置信息通过getProperties获取			
			buider.applySettings(con.getProperties());

			// 3通过ServiceRegistryBuilder获取到一个ServiceRegistry 对象
			ServiceRegistry regist = buider.buildServiceRegistry();

			// 4创建一个sessionfactory对象
			factory = con.buildSessionFactory(regist);

			System.out.println("ssss");
			// 5获取到一个session对象

		}
		return factory.openSession();
	}

	public void closeF() {
		factory.close();

	}

}
