package utilities;

import managers.BrowserFactory;
import managers.FrameworkException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BaseTest {
	BrowserFactory browserFactory = new BrowserFactory();
	WebDriver driver = browserFactory.createDriver();
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));



	public void sendText(WebElement element, String text, String elementName) {
		try {
			waitTill(element, "visible");
			element.sendKeys(text);
		} catch (Exception e) {
			throw new FrameworkException("Unknown exception occured while sending text for: " + elementName + "---"
					+ e.getClass() + "---" + e.getMessage());
		}
	}

// This function is created for edit fields	for whatsapp profile
	public void clearAndSendText(WebElement element, String text, String elementName) {
		try {
			waitTill(element, "visible");
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			throw new FrameworkException("Unknown exception occured while sending text for: " + elementName + "---"
					+ e.getClass() + "---" + e.getMessage());
		}
	}
	public void clickElement(WebElement element, String buttonName) {
		try {
			waitTill(element, "enable");
			try {
				element.click();
			} catch (Exception e) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
			}
		} catch (Exception e) {
			throw new FrameworkException("Unknown exception occured while click on: " + buttonName + "---"
					+ e.getClass() + "---" + e.getMessage());
		}
	}
		public void waitTill(WebElement element, String state) {
			try {
				switch (state.toLowerCase()) {
					case "visible":
						wait.until(ExpectedConditions.visibilityOf(element));
						break;
					case "enable":
						wait.until(ExpectedConditions.elementToBeClickable(element));
						break;
					case "invisible":
						wait.until(ExpectedConditions.invisibilityOf(element));
						break;
					default:
						wait.until(ExpectedConditions.visibilityOf(element));
				}
			} catch (TimeoutException e) {
				throw new FrameworkException(
						"Element state: *  '" + state + element.toString() + "' not found within defined time limit.");
			} catch (NoSuchElementException e) {
				throw new FrameworkException("Element : *  '" + element.toString() + "' not found in DOM.");
			} catch (Exception e) {
				throw new FrameworkException("Unknown exception occured while waiting for element: *  '"
						+ element.toString() + "'---" + e.getClass() + "---" + e.getMessage());
			}

		}


	}