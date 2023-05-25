package AppiumProject;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.ServerSocket;
import java.util.Properties;
import java.io.FileReader;

public class Capabilites {
    	public static String deviceName;
		public static String platformName;
		public static String appPackage;
		public static String appActivity;
		public static String chromeDriver;
		public static Process rt;
		public static AppiumDriverLocalService service;
		
		
		public AppiumDriverLocalService startAppium(){
			boolean flag = checkifserverisRunning(4723);
			if(!flag){
					service = AppiumDriverLocalService.buildDefaultService();
			}
			return service;
			
		}
		public static boolean checkifserverisRunning(int port)
		{
			boolean isServerRunning=false;
			ServerSocket serversocket;
			try{
				serversocket = new ServerSocket(port);
				serversocket.close();
			}
			catch(IOException e)
			{
				isServerRunning = true;
			}
			finally {
				serversocket=null;
			}
			return isServerRunning;
		}
		public static void startEmulator() throws IOException, InterruptedException {
			 rt = Runtime.getRuntime().exec("C:\\Users\\krish\\Desktop\\emulator.bat");
			 Thread.sleep(10000);
		}
		
		public static AndroidDriver<AndroidElement> hybridCapability() throws IOException, InterruptedException {
			 startEmulator();
			 FileReader fReader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\Global.Properties");
			 Properties ps = new Properties();
			 ps.load(fReader);
			 deviceName = ps.getProperty("deviceName");
			 platformName = ps.getProperty("platformName");
			 appPackage = ps.getProperty("appPackage");
			 appActivity = ps.getProperty("appActivity");
			 chromeDriver = ps.getProperty("chromedriverpath");
			 DesiredCapabilities dc = new DesiredCapabilities();
			 dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			 dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
			 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
			// dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			 dc.setCapability(MobileCapabilityType.NO_RESET, true);
			 dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, chromeDriver);
			 AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			 return driver;
		
	}

}
