package com.iotek.test;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iotek.entity.Person;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestMethod {
	@Test
	public void testSpring() throws SQLException {
        ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
	    Person p = (Person) context.getBean("person7");
	    System.out.println(p);
//        ComboPooledDataSource cpds = (ComboPooledDataSource) context.getBean("dataSource");
//	    System.out.println(cpds.getConnection());
	}
}
