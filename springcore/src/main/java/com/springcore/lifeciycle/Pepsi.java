package com.springcore.lifeciycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean ,DisposableBean{

	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destory method");
	}
	
}
