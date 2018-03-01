package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		//TV tv = new SamsungTV();
		//TV tv = new LgTV();
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean("samsung");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		///*
		// 1. Spring �����̳ʸ� ����
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 3. Spring �����̳� ����
		factory.close();
		//*/
	}
}
