package generic;

import org.openqa.selenium.WebElement;

public class ElementControl {
	
	public void clickElement(WebElement element) {
		element.click();
	}
	
	public void type(WebElement element, String textToType) {
		element.sendKeys(textToType);
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}

}
