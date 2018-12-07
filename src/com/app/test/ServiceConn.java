package com.app.test;

public class ServiceConn implements AutoCloseable {

	public void close() throws Exception {
		
System.out.println("closed!!!");		
	}

}
