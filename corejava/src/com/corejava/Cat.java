package com.corejava;

class Animals{
	String breead;
	int age;
	Animals(){
		
	}

	public static void main(String[] args) {
}
}
public class Cat extends Animals {

	 Cat(){
		 super();
		 System.out.println("manoj is lover boy");
	 }
	 Cat(String breead,int age){
		 System.out.println("parameterized constructor");
		 this.breead=breead;
		 this.age=age;
	 }
	public static void main(String[] args) {
		System.out.println("main method started from cat");
		Cat c= new Cat();
		c.catinfo();
		Cat c1= new Cat("pilli",5);
		c1.catinfo();

	}
  void catinfo(){
	 System.out.println("name of breead="+breead);
	 System.out.println("age of the cat="+age);
 }
}
