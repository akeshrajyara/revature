package com.pack2;

public class ExceptionCode1 {
	public static void main(String[] args){
	try {
	int num = 1/0;
	System.out.println("given number :"+num);
	}
	catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
	} 
}
}
