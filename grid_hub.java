package GRIDS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class grid_hub {

	WebDriver dr;
	String node_url="http://192.168.43.56:5566/wd/hub", aut_url="http://demowebshop.tricentis.com";
	@BeforeClass
	public void setup() {
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	
	try {
		URL node_1_url= new URL(node_url);
		dr= new RemoteWebDriver(node_1_url,cap);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	}
	
	@Test
	public void laptop_b_node1(){
	dr.get(aut_url);
	}
	
	
	
}
