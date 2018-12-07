package com.app.test;


public class Test {
	public static void main(String[]args) {
		System.out.println("starts");
		try(ServiceConn sc=new ServiceConn()) {
			System.out.println("done");
			
		} catch (Exception e) {
System.out.println("problem");
		}
		System.out.println("bye");
}
}