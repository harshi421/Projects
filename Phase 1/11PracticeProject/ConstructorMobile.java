package com.Harshitha.sl.Assignements;
public class ConstructorMobile {
    String brand;
    String name;
    int price;
    String ram;
    ConstructorMobile()
    {
    	
    }
    ConstructorMobile(String b,String n,int p,String r){
    	this.brand=b;
    	this.name=n;
    	this.price=p;
    	this.ram=r;
    }
	public static void main(String[] args) {
		ConstructorMobile m1=new ConstructorMobile();
		ConstructorMobile m2=new ConstructorMobile("ReadMi","8pro",20000,"8gb");
		ConstructorMobile m3=new ConstructorMobile("Vivo","16pro",30000,"16gb");
		System.out.println(m2.brand+" "+m2.name+" "+m2.price+" "+m2.ram);
		System.out.println(m3.brand+" "+m3.name+" "+m3.price+" "+m3.ram);
     }
}
