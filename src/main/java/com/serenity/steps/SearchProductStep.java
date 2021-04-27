package com.serenity.steps;
import java.util.Set;
import com.serenity.pages.NoonHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SearchProductStep extends ScenarioSteps {
	private NoonHomePage noonHomePage;
	String winHandle; 
	Set<String> winHandles;
	@Step
	public void openApp() throws InterruptedException {
		noonHomePage.getDriver().get("https://www.noon.com/uae-en/");
		System.out.println("${user.dir}");

	}

	@Step
	public void navigateToMenu() throws InterruptedException {
		winHandle = noonHomePage.getDriver().getWindowHandle();
		noonHomePage.withAction().moveToElement(noonHomePage.allCategories).moveToElement(noonHomePage.grocery)
				.moveToElement(noonHomePage.beverages).click().build().perform();

		winHandles = noonHomePage.getDriver().getWindowHandles();

		for (String handle : winHandles) {
			if (!handle.equals(winHandle)) {
				noonHomePage.getDriver().switchTo().window(handle);
				noonHomePage.$("//input[1]").sendKeys("Dubai United Arab Emirates");
				noonHomePage.$("//div[@data-qa=\"suggestions_Maps\"]/div[1]").click();
				noonHomePage.getDriver().close();
			}
		}
		noonHomePage.getDriver().switchTo().window(winHandle);
		noonHomePage.withAction().moveToElement(noonHomePage.allCategories).moveToElement(noonHomePage.grocery)
				.moveToElement(noonHomePage.beverages).click().build().perform();
		winHandles.clear();
		winHandles = noonHomePage.getDriver().getWindowHandles();

		for (String handle : winHandles) {
			if (!handle.equals(winHandle)) {
				noonHomePage.getDriver().switchTo().window(handle);
				noonHomePage.withAction().moveToElement(noonHomePage.$("(//div[contains(.,'Popularity')])[11]")).moveToElement(noonHomePage.$("(//div[contains(.,'Price: Low to High')])[11]"))
			.click().build().perform();

			}
		}
		noonHomePage.allCategories.click();
	}

	@Step
	public void sortPrices() throws InterruptedException {
		noonHomePage.getDriver().get("https://www.noon.com/uae-en/");

	}
}
