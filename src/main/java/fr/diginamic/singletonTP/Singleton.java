package fr.diginamic.singletonTP;

import java.io.File;
import java.util.ResourceBundle;

public class Singleton {

	public static Singleton instance = new Singleton();
	private ResourceBundle bundle;

	private Singleton() {
		bundle = ResourceBundle.getBundle("configuration");
		}

	public static Singleton getInstance() {
		return instance;
	}

	public String getValue(String key) {
		return bundle.getString(key);
	}

}
