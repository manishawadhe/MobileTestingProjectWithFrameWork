package AppiumProject;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;




public class TestCases extends Capabilites {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
//		startAppium().start();
		driver = hybridCapability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled = true, priority = 0)
	public void tc1() throws InterruptedException{
		TouchAction taction = new TouchAction(driver);
	      
	       AndroidElement bookNow=	driver.findElement(By.xpath("//*[@text='BOOK NOW']"));
	       taction.tap(TapOptions.tapOptions().withElement(element(bookNow))).perform();
	      
	       AndroidElement hireBike	=driver.findElement(By.id("com.forbinary.banjararide:id/llMainLayout"));
	       taction.tap(TapOptions.tapOptions().withElement(element(hireBike))).perform();
	       
	       AndroidElement Hornet=	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"CB Hornet 160R\"))"));
	       taction.tap(TapOptions.tapOptions().withElement(element(Hornet))).perform();
	       
	       AndroidElement days=  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"7 days \"))"));
	       taction.tap(TapOptions.tapOptions().withElement(element(days))).perform();
	       
	       AndroidElement booknow=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Book Now\")"));
		   taction.tap(TapOptions.tapOptions().withElement(element(booknow))).perform();
			
		   AndroidElement date=driver.findElement(By.id("com.forbinary.banjararide:id/llDateContainer"));
		   taction.tap(TapOptions.tapOptions().withElement(element(date))).perform();
			
		   driver.findElementByAccessibilityId("26 May 2023").click();
			
		   driver.findElement(By.xpath("//*[@text='OK']")).click();
			
//			Navigate back to home page
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			Thread.sleep(3000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			
			
	}
	
			
//			Click On menu bar
	@Test(enabled = true, priority = 1)
	public void tc2() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);
			
			 AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
			 taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
			
			 AndroidElement Booking =	driver.findElement(By.xpath("//*[@text='Bookings']"));
		     taction.tap(TapOptions.tapOptions().withElement(element(Booking))).perform();
			 Thread.sleep(2000);
			   
			 AndroidElement Search =	driver.findElementById("com.forbinary.banjararide:id/search_button");
			 taction.tap(TapOptions.tapOptions().withElement(element(Search))).perform();
		      	
		     Thread.sleep(2000);
		     driver.findElementById("com.forbinary.banjararide:id/search_src_text").sendKeys("activa");
		      	
		      	
			 AndroidElement Clearbtn =	driver.findElementById("com.forbinary.banjararide:id/search_close_btn");
			 taction.tap(TapOptions.tapOptions().withElement(element(Clearbtn))).perform();
			      
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 Thread.sleep(3000);
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 Thread.sleep(3000);
	}
			 
	@Test(enabled = true, priority = 2)
	public void tc3() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);
		
			 AndroidElement callus=	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))"));
		     taction.tap(TapOptions.tapOptions().withElement(element(callus))).perform();
		     
//		     go back to the app
		     
//		     driver.activateApp("com.forbinary.banjararide");
//			 driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
//			 taction.press(PointOption.point(370, 1250)).waitAction().moveTo(PointOption.point(370, 200)).release().perform();
//			 taction.press(PointOption.point(370, 1250)).waitAction().moveTo(PointOption.point(370, 200)).release().perform();
		     
		     driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			 Thread.sleep(3000);
			 
//			 Go back to the outside the app
			 
//			 driver.pressKey(new KeyEvent(AndroidKey.BACK));
			


	}
	
	
//	choose the language
	
	@Test(enabled = true, priority = 3)
	public void tc4() {
		TouchAction taction = new TouchAction(driver);
		
		AndroidElement menu1 =	driver.findElementByAccessibilityId("Open");
		taction.tap(TapOptions.tapOptions().withElement(element(menu1))).perform();
		
		AndroidElement language1 =	driver.findElement(By.xpath("//*[@text='Change Language']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(language1))).perform();
	      
	    AndroidElement hindi =	driver.findElement(By.xpath("//*[@text='हिंदी']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(hindi))).perform();
		
	
	    AndroidElement menu2 =	driver.findElementByAccessibilityId("Open");
		taction.tap(TapOptions.tapOptions().withElement(element(menu2))).perform();
			
		AndroidElement language2 =	driver.findElement(By.xpath("//*[@text='भाषा बदलो']"));
		taction.tap(TapOptions.tapOptions().withElement(element(language2))).perform();
		      
		AndroidElement english =	driver.findElement(By.xpath("//*[@text='ENGLISH']"));
		taction.tap(TapOptions.tapOptions().withElement(element(english))).perform();
	     
		
	}
	
	
//	See the pdf file
	
//	@Test(enabled = true, priority = 4)
//	public void tc5() throws InterruptedException {
//		TouchAction taction = new TouchAction(driver);
//		
//		AndroidElement menu =	driver.findElementByAccessibilityId("Open");
//		taction.tap(TapOptions.tapOptions().withElement(element(menu))).perform();
//		
//		AndroidElement ic =	driver.findElement(By.xpath("//*[@text='Information Center']"));
//	    taction.tap(TapOptions.tapOptions().withElement(element(ic))).perform();
//	    
//	    AndroidElement terms =	driver.findElement(By.xpath("//*[@text='Terms & Conditions']"));
//	    taction.tap(TapOptions.tapOptions().withElement(element(terms))).perform();
//	    
//	    AndroidElement sub =	driver.findElement(By.xpath("//*[@text='Terms & Condition']"));
//	    taction.tap(TapOptions.tapOptions().withElement(element(sub))).perform();
//	    
//	    AndroidElement pdf=driver.findElement(By.id("com.forbinary.banjararide:id/llFileLinearLayout"));
//		taction.tap(TapOptions.tapOptions().withElement(element(pdf))).perform();
//		
//		driver.findElement(By.xpath("//*[@text='OK']")).click();
//		
//	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
//	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		
//		
//	}
	
	@Test(enabled = true, priority = 5)
	public void tc6() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);

		AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		AndroidElement TermsAndCondition =	driver.findElement(By.xpath("//*[@text='Profile']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(TermsAndCondition))).perform();
	      
	    driver.findElementById("com.forbinary.banjararide:id/action_edit").click();
	    driver.findElementById("com.forbinary.banjararide:id/edtInputProfile").clear();
	    driver.findElementById("com.forbinary.banjararide:id/edtInputProfile").sendKeys("Manisha Wadhe");
	    
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
//	    AndroidElement back =	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]");
//		taction.tap(TapOptions.tapOptions().withElement(element(back))).perform();
//		
//		AndroidElement Back =	driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]");
//		taction.tap(TapOptions.tapOptions().withElement(element(Back))).perform();
	      
	}
	
	@Test(enabled = true, priority = 6)
	public void tc7() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);

		AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		AndroidElement ic =	driver.findElement(By.xpath("//*[@text='Information Center']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(ic))).perform();
	    
	    AndroidElement au =	driver.findElement(By.xpath("//*[@text='About Us']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(au))).perform();
	    
	    
	    AndroidElement about =	driver.findElement(By.xpath("//*[@text='About Company!']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(about))).perform();
	    
	    String text = driver.findElementById("com.forbinary.banjararide:id/infocenterlib_page_title").getText();
	    Assert.assertEquals(text, "About Company!");
	    Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	@Test(enabled = true, priority = 7)
	
	public void tc8() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);

		AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		AndroidElement ic =	driver.findElement(By.xpath("//*[@text='Information Center']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(ic))).perform();
	    
	    AndroidElement au =	driver.findElement(By.xpath("//*[@text='About Us']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(au))).perform();
	 
	    
	    AndroidElement add = driver.findElement(By.xpath("//*[@text='Address And Contact Number.']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(add))).perform();
	    
	    String text = driver.findElementById("com.forbinary.banjararide:id/infocenterlib_page_description").getText();
//	    Assert.assertEquals(text, "Address : HIG 3, B-Sector, Sonagiri, BHEL, Bhopal. (Near Piplani PetrolPump) - 462022 Contact Number : 9144748983 Email Id : info@banjararide.com Bike on rent in bhopal.");
	    
	    Assert.assertTrue(text.contains("9144748983"));
	    Assert.assertTrue(text.contains("info@banjararide.com"));
	    Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    
	}
	
	@Test(enabled = true, priority = 8)
	
	public void tc9() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);
		
		AndroidElement days=  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Queries $ Complaints\"))"));
	    taction.tap(TapOptions.tapOptions().withElement(element(days))).perform();
	    
	    driver.findElementById("com.forbinary.banjararide:id/btnSend").click();
	    driver.findElementById("com.forbinary.banjararide:id/btnTakePhoto").click();
	    
	    AndroidElement add = driver.findElement(By.xpath("//*[@text='Take photo']"));
	    taction.tap(TapOptions.tapOptions().withElement(element(add))).perform();
	    
	    AndroidElement shutter = driver.findElementByAccessibilityId("Shutter");
	    taction.tap(TapOptions.tapOptions().withElement(element(shutter))).perform();
	    
	    AndroidElement done = driver.findElementByAccessibilityId("Done");
	    taction.tap(TapOptions.tapOptions().withElement(element(done))).perform();
	   
	    driver.findElementById("com.forbinary.banjararide:id/edtReportTitle").sendKeys("Activa");
	    driver.findElementById("com.forbinary.banjararide:id/edtReportDescription").sendKeys("Activa is Good bike");
	    
	    AndroidElement select =  driver.findElementById("com.forbinary.banjararide:id/baselib_category_text");
	    taction.tap(TapOptions.tapOptions().withElement(element(select))).perform();
	    
	    AndroidElement query =  driver.findElementByXPath("//*[@text='QUERY']");
	    taction.tap(TapOptions.tapOptions().withElement(element(query))).perform();
	    
	    AndroidElement submit =  driver.findElementByXPath("//*[@text='SUBMIT']");
	    taction.tap(TapOptions.tapOptions().withElement(element(submit))).perform();
	  
	    Thread.sleep(2000);
	    
	    String abc = driver.findElementById("com.forbinary.banjararide:id/txtResponseMessage").getText();
	    Assert.assertEquals(abc, "Thank you for your response");
	    
	    Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	
	
	@Test(enabled = true, priority=9)
	public void tc10() throws InterruptedException {
		TouchAction touchA= new TouchAction(driver);
		
		AndroidElement menu = driver.findElementByAccessibilityId("Open");
		touchA.tap(TapOptions.tapOptions().withElement(element(menu))).perform();
		
		AndroidElement complaint = driver.findElementByXPath("//*[@text='Complaints And Queries']");
		touchA.tap(TapOptions.tapOptions().withElement(element(complaint))).perform();
		
		AndroidElement findActiva = driver.findElementByXPath("//*[@text='Activa']");
		touchA.tap(TapOptions.tapOptions().withElement(element(findActiva))).perform();
		
		// Asserting
		String title = driver.findElementByXPath("//*[@text='Activa']").getText();
		String description = driver.findElementByXPath("//*[@text='Activa is Good bike']").getText();
		
		Assert.assertEquals(title, "Activa");
		Assert.assertEquals(description, "Activa is Good bike");
		
		
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	}
	
	@Test(enabled = true, priority = 10)
	public void tc11() throws InterruptedException {
		TouchAction taction = new TouchAction(driver);
		
		 AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
		 taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
		
		 AndroidElement Booking =	driver.findElement(By.xpath("//*[@text='Bookings']"));
	     taction.tap(TapOptions.tapOptions().withElement(element(Booking))).perform();
	     Thread.sleep(1000);
	     
	     AndroidElement urbooking =	driver.findElementById("com.forbinary.banjararide:id/menu_info");
	     taction.tap(TapOptions.tapOptions().withElement(element(urbooking))).perform();
	     
	     AndroidElement upcoming =	driver.findElementByXPath("//*[@text='Bullet X 350']");
	     taction.tap(TapOptions.tapOptions().withElement(element(upcoming))).perform();
	     
	     String bullet = driver.findElementByXPath("//*[@text='Bullet X 350']").getText();
	     Assert.assertEquals(bullet, "Bullet X 350");
	     
	     String banjara = driver.findElementByXPath("//*[@text='BANJARARIDE']").getText();
	     Assert.assertEquals(banjara, "BANJARARIDE");
	     Thread.sleep(1000);
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
			driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
//	
//	@Test(enabled = true, priority = 11)
//	public void tc12() throws InterruptedException {
//		TouchAction taction = new TouchAction(driver);
//		
//		 AndroidElement Menu =	driver.findElementByAccessibilityId("Open");
//		 taction.tap(TapOptions.tapOptions().withElement(element(Menu))).perform();
//		
//		 AndroidElement Booking =	driver.findElement(By.xpath("//*[@text='Bookings']"));
//	     taction.tap(TapOptions.tapOptions().withElement(element(Booking))).perform();
//	     
//	     AndroidElement urbooking =	driver.findElementById("com.forbinary.banjararide:id/menu_info");
//	     taction.tap(TapOptions.tapOptions().withElement(element(urbooking))).perform();
//	     
//	     AndroidElement upcoming =	driver.findElementByXPath("//*[@text='Bullet X 350']");
//	     taction.tap(TapOptions.tapOptions().withElement(element(upcoming))).perform();
//	     
//	     AndroidElement cancel =	driver.findElementById("com.forbinary.banjararide:id/llCancel");
//	     taction.tap(TapOptions.tapOptions().withElement(element(cancel))).perform();
//	     
//	     AndroidElement send =	driver.findElementByXPath("//*[@text='SEND']");
//	     taction.tap(TapOptions.tapOptions().withElement(element(send))).perform();
//	     
//	     Thread.sleep(1000);
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			driver.pressKey(new KeyEvent(AndroidKey.BACK));
//			
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
