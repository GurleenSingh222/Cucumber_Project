package pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import base.TestBase;

	public class LoginPage extends TestBase {
		
		public LoginPage(){
			//super(); //if base class constructor is not being initialized.
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id = "ap_email")
		public WebElement username;
		
		@FindBy(xpath = "//input[@id='continue']")
		public WebElement continueButton;
		
		@FindBy(xpath = "(//div[@class='a-alert-content'])[4]")
		public WebElement UsernameErr;
		
		
		@FindBy(id = "ap_password")
		public WebElement password;
		
		@FindBy(id="signInSubmit")
		WebElement signinbutton;
		
		
		@FindBy(xpath = "//*[@class='a-list-item']")
		WebElement passwordErr;
		
		public void openLoginPage() {
			driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0\n"
					);
		}
		
		public String readTitle() {
			return driver.getTitle();
		}
		
		public void wrongUsername(String a) {
			
			username.sendKeys(a);
			continueButton.click();
			
		}
		
		public String readErr() {
			
			return UsernameErr.getText();
			
		}
		
		public void correctUsername() {
			username.sendKeys(prop.getProperty("correctEmail"));
			continueButton.click();
		}
		
		public void wrongPassword() {
			password.sendKeys(prop.getProperty("incorrectPassword"));
			signinbutton.click();
		}
		
		public String passwordErr() {
			
			String err = passwordErr.getText();
			return err;
			
		}
		
		public void correctPassword() {
			password.sendKeys(prop.getProperty("correctPassword"));
		    signinbutton.click();
		}
	}



