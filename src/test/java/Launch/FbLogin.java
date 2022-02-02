package Launch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class FbLogin extends BaseClass{

	public FbLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtusr;
	
	@FindBy(id="pass")
	private WebElement txtpss;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btn;

	public WebElement getTxtusr() {
		return txtusr;
	}

	public WebElement getTxtpss() {
		return txtpss;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	
}
