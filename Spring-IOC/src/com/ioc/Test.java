package com.ioc;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

		BeanOne B1 = (BeanOne) container.getBean("B1");
		BeanTwo B2 = (BeanTwo) container.getBean("B2");

		System.out.println(B1.Name);
		System.out.println(B1.mailid);

		System.out.println(B2.DOB + B2.rank);

		BeanThree B3 = (BeanThree) container.getBean("B3");

		Map<String, Integer> map = B3.map;
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}
}
