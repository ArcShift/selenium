/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geckotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Jelajah Tekno Indone
 */
public class GeckoTest {

  public GeckoTest() {
    System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
    WebDriver webDriver= new FirefoxDriver();
    webDriver.get("http://google.com");
    webDriver.findElement(By.id("lst-ib")).sendKeys("test");
//    webDriver.quit();
  }
  
  public static void main(String[] args) {
    GeckoTest geckoTest = new GeckoTest();
  }
  
}
