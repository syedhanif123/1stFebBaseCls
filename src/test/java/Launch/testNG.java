package Launch;

import java.io.IOException;
import java.util.Date;

import org.junit.*;
import org.sample.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class testNG  {
	
	
	@BeforeClass
	private void browserLnch() {
		System.out.println("launch");
	}
	
	@AfterClass
	private void Quit() {
		System.out.println("quit");
	}
	
	@BeforeMethod
	private void stattime() {
		System.out.println("strt time");
	}
	
	@AfterMethod
	private void Endtime() {
		System.out.println("end time");
	}
	@Test
	private void Tc3() {
		System.out.println("tc3");
	}
	@Test
	private void Tc1() {
		System.out.println("tc1");
	}
	@Test
	private void Tc2() {
		System.out.println("tc2");
	}
	
}
