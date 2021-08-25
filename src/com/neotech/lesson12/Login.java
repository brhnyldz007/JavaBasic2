package com.neotech.lesson12;

public class Login {
	public static void main(String[] args) {
		
		/*//1.Open the web browser
		System.setProperty("webdriver.chrome.driver","C:\\SDETuniversity\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // burda ChromeDriver yerine eger firefox kullaniyorsak onu yazariz.
		 
		 
		
		//2.Navigate to the web application ///// SONRA HANGI WEBSITESIE GITMEK ISTIYORSAK GET ILE CAGIRIYORUZ
		//http://sdettraning.com
	    driver.get("http://www.demo.guru99.com/test/delete_customer.php");
	    
	    //oencereyi en buyuk olcude oldugunu belirtmek icin asagidaki kodu yazariz
	    driver.manage().window().maximize();
	    
	    
	    //web sitesi acildiktan sonra elementi tiklayip findElement metoduyla elementi bulup gerekli islemi yapiyoruz
	    
	    
		
		//3.Enter email address

	  //todo                      Basit Uyarı
	    driver.findElement(By.cssSelector(".btn.btn-danger")).click();
	    
	    driver.findElement(By.cssSelector("span.cookie-choices-buttons>:nth-child(2)")).click();
		
		//4.Enter password
		

        WebElement isim = driver.findElement(By.name("firstname"));
        isim.sendKeys("Ömer");

		//5.Click login
        WebElement soyisim = driver.findElement(By.name("lastname"));

        soyisim.sendKeys("Özdemir");
		
		//6.Get confirmation
		
		//7.Close the browser
        

      //Date

              WebElement date = driver.findElement(By.cssSelector("#datepicker"));

              //     js.executeScript("arguments[0].scrollIntoView();", date);

              date.sendKeys("23.07.2020");


              //profession

              driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
              
              *
              *
        //automation tools

        List<WebElement> tools = driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));

        for (WebElement tool : tools) {
            tool.click();
            Thread.sleep(500);
        }

        //Continents

        WebElement element = driver.findElement(By.cssSelector("#continents"));

        Select slc = new Select(element);

        slc.selectByVisibleText("Europe");
              *
              *
       //selenium Commands

        element = driver.findElement(By.cssSelector("#selenium_commands"));


        slc = new Select(element);

        slc.selectByIndex(0);
        slc.selectByIndex(1);


        Thread.sleep(3000);
              *
              */
	}

}
