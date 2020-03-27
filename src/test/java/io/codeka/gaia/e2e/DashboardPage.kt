package io.codeka.gaia.e2e

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class DashboardPage (val webDriver: WebDriver){

    init {
        if(! webDriver.currentUrl.endsWith("/dashboard")){
            throw IllegalStateException("This is not the dashboard page. Current page is ${webDriver.title}")
        }
    }

    fun waitForPageLoaded() {
        val wait = WebDriverWait(webDriver, 10)
        wait.until(ExpectedConditions.titleIs("Gaia - Dashboard"))
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("b-overlay"), 0))
    }

    @FindBy(xpath = "(//*[contains(@class,'widget-value')])[1]")
    private lateinit var modulesCountElement: WebElement

    @FindBy(xpath = "(//*[contains(@class,'widget-value')])[2]")
    private lateinit var stacksCountElement: WebElement

    @FindBy(xpath = "(//*[contains(@class,'widget-value')])[3]")
    private lateinit var stacksToUpdateCountElement: WebElement

    fun modulesCount() = this.modulesCountElement.text.toInt()
    fun stacksCount() = this.stacksCountElement.text.toInt()
    fun stacksToUpdateCount() = this.stacksToUpdateCountElement.text.toInt()

}
