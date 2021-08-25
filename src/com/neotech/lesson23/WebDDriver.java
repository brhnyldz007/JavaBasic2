package com.neotech.lesson23;

public interface WebDDriver {
	
     void  openBrowser();
     void closeBrowser();
     void maximizeWindow();
     void findElement();
}

interface Camera{
	
	
	void takePicture();
	
}
 
class ChromeDriver implements WebDDriver,Camera{

	@Override
	public void takePicture() {
	System.out.println("burhan");
		
	}

	@Override
	public void openBrowser() {
	System.out.println("Ivonne");
		
	}

	@Override
	public void closeBrowser() {
	System.out.println("Mila");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Lillian");
		
	}

	@Override
	public void findElement() {
		System.out.println("Yildiz");
		
	}
	
}

class FirefoxDriver implements WebDDriver,Camera{

	@Override
	public void takePicture() {
		System.out.println("Arzu");
		
	}

	@Override
	public void openBrowser() {
	System.out.println("Menekse");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Ali");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Tanju");
		
	}

	@Override
	public void findElement() {
		System.out.println("Yildiz");
		
	}
	
	
}
