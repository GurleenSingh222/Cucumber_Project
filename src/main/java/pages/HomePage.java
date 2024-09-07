package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
		//super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Best Sellers")
	public WebElement BestSellerButton;
	
	@FindBy(id="nav-logo")
	public WebElement homeButton;
	
	public void openHomePage() {
		
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=677743576480&hvpos=&hvnetw=g&hvrand=82341690002247877&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000847&hvtargid=kwd-360364908397&ref=pd_sl_2g3jlg2slz_e&hydadcr=20061_13508849&gad_source=1\n");
		
	}
	
	public String verifyTitle() {
		return(driver.getTitle());
	}
	
	public void clickonBestSellerLink() {
		BestSellerButton.click();
	}
	
	public void clickonHomeButton() {
		homeButton.click();
	}

}
