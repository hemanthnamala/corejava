package com.corejava;

public class ConstructorChainingThroughThis {
	String model;
	int quantity;
	double price;
	 ConstructorChainingThroughThis(){
		 this("iq  pro");
	 }
	 ConstructorChainingThroughThis(String model){
		 this(model,2);
	 }
	 ConstructorChainingThroughThis(String model,int quantity){
		this(model,quantity,9000); 
	 }
	 ConstructorChainingThroughThis(String model,int quantity,double price){
		this.model=model;
		this.quantity=quantity;
		this.price=price;
	 }
void disp() {
	System.out.println(model+" "+quantity+""+price);
}
	public static void main(String[] args) {
		 ConstructorChainingThroughThis t=new  ConstructorChainingThroughThis();
		 t.disp();

	}

}
