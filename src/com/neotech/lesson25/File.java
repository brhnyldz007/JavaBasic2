package com.neotech.lesson25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class File {

	public static void main(String[] args) throws IOException {
		// 1. create the path to the file
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		String fullPath = projectPath + "/configs/homework.txt";
		System.out.println(fullPath);
		// 2. create the object of FileInputStream
		FileInputStream fis = new FileInputStream(fullPath);
		Properties p = new Properties();
		p.load(fis);
		System.out.println(p);
		String browser = p.getProperty("browser");
		System.out.println("browser -> " + browser);
		String browser2 = p.getProperty("BROWSER");
		System.out.println("BROWSER -> " + browser2);

		System.out.println("--------------------------------");
		Set<Object> keys = p.keySet();
		for (Object k : keys) {
			System.out.println(k + " => " + p.get(k));
		}
		System.out.println("-------Selenium Steps-------");
		System.out.println("I am opening this browser: " + p.getProperty("browser"));
		System.out.println("I will go to this page: " + p.getProperty("url"));
		System.out.println("I will enter the username: " + p.getProperty("username"));
		System.out.println("I will enter the password: " + p.getProperty("password"));
		System.out.println("------Write to the file-------");

		// 1. add a new pair into the properties
		p.setProperty("phonenumber", "8732848723");
		// 2. We need FileOutputStream to write to the file
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2.txt");

		// 3. Persist/store/save into a file
		p.store(fos, "I am storing into a new file");
	}
}
