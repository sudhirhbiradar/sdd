package com.objectrepository.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectproperties {
	
	public static void main(String[] args) throws IOException {										
		
		// Create WebDriver Instance		
		    WebDriver driver;			
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\SUD\\Desktop\\chromedriver.exe");					
		    driver = new ChromeDriver();					
		    driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");					
		    driver.manage().window().maximize();			
		// Load the properties File		
		    Properties obj = new Properties();					
		    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\gmail.properties");									
		    obj.load(objfile);					
		// Nagigate to link Mobile Testing and Back		
		    driver.findElement(By.xpath(obj.getProperty("Gmailid"))).sendKeys("dsb9585");							
		    		
		// Enter Data into Form		
		    driver.findElement(By.xpath(obj.getProperty("Next"))).click();									
		    driver.findElement(By.id(obj.getProperty("Password"))).sendKeys("Dhanu@2019");	
		    driver.findElement(By.xpath(obj.getProperty("Next2"))).click();
		   
		  }		

		}		

