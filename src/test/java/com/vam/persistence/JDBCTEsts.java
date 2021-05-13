package com.vam.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTEsts {

	static { 
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		} catch(Exception e) { 
			e.printStackTrace(); 
		} 
	} 
	
	@Test 
	public void testConnection() { 
		try(Connection con = DriverManager.getConnection( 
				"jdbc:mysql://localhost:3306/board?serverTimezone=Asia/Seoul",
				"pdc",
				"qkrehdcks")){
			System.out.println("잘연결됐음==========>"+con);
		} catch (Exception e) {
			fail(e.getMessage()); 
		} 
	
	}	
	
	
}
