package com.neotech.lesson23;

public class WebDDriverTest {

	public static void main(String[] args) {
		
		WebDDriver str = new ChromeDriver();
		Camera str1 =new ChromeDriver();
		str.openBrowser();
		str.closeBrowser();
		str.maximizeWindow();
		str.findElement();
		str1.takePicture();
		
		System.out.println("===============");
		
		Camera str2 = new FirefoxDriver();
		WebDDriver str4 = new FirefoxDriver();
		str2.takePicture();
		str4.closeBrowser();
		str4.findElement();
		str4.openBrowser();
		str4.maximizeWindow();
	}
}
