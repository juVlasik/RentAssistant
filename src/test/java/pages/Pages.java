package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class Pages {

public  Pages() {
	    WebDriver driver = new ChromeDriver();
		PageFactory.initElements(driver, this); 
		 
	}
	
	

@FindBy (xpath = "//a[@class='apa']")
public WebElement apt_housing_button;



@FindBy (xpath = "//a[@class='sha']")
public WebElement rooms_wanted_button;



@FindBy (xpath = "//a[@class='roo']")
public WebElement rooms_shared_button;




}
