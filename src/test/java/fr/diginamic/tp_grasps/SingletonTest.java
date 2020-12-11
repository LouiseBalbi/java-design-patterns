package fr.diginamic.tp_grasps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.singletonTP.Singleton;

public class SingletonTest {
	
	@Test
	public void testGetUrl() {
		Singleton instance = Singleton.getInstance();
		String value = instance.getValue("db.url");
		assertEquals(value, "jdbc:mysql://localhost:3306/mabase");
	}
	
	@Test
	public void testGetUser() {
		Singleton instance = Singleton.getInstance();
		String value = instance.getValue("db.user");
		assertEquals(value, "root");
	}
	
	@Test
	public void testGetPwd() {
		Singleton instance = Singleton.getInstance();
		String value = instance.getValue("db.password");
		assertEquals(value, "1234");
	}

}
