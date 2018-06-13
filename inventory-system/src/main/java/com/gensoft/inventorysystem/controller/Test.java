package com.gensoft.inventorysystem.controller;

import org.springframework.web.client.RestTemplate;

public class Test {
	RestTemplate rest=new RestTemplate();
	public String getNn() {
		return nn;
	}
	public void setNn(String nn) {
		this.nn = nn;
	}
	private String nn;
	public void input() {
		try {
		String name="hello";
		String name1;
		name1=rest.postForObject("http://localhost:8073/getName",name, String.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.input();
	}
	
}
