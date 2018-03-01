package com.springbook.ioc.injection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for (String address : addressList) {
			System.out.println("Address in List: " + address);
		}
		
		Map<String, String> addressMap = bean.getAddressMap();
		if (addressMap.size() > 0) {
			Iterator<String> keys = addressMap.keySet().iterator();
			while (keys.hasNext()) {
				System.out.println("Address in Map: " + addressMap.get(keys.next()));
			}
		}		
		
		factory.close();
	}

}
