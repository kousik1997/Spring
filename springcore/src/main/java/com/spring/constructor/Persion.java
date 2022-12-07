package com.spring.constructor;

import java.util.List;

public class Persion {

	private String name;
	private int persionId;
	private Certi certi;
	private List list;
	
	public Persion(String name,int persionId,Certi certi ,List list) {
		this.name=name;
		this.persionId=persionId;
		this.certi=certi;
		this.list=list;
	}

	@Override
	public String toString() {
		
		return this.name+" : "+this.persionId+"{ "+this.certi.name+" }"+" [ "+this.list +" ]";
	}
}
