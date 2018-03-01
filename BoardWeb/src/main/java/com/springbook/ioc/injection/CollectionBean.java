package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	private List<String> addressList;
	private Map<String, String> addressMap;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	
	
}
