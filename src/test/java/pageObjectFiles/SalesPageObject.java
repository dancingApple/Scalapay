package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.SuperClass;

import java.util.ArrayList;
import java.util.List;

public class SalesPageObject extends SuperClass {
    private final By salesPageTitle = By.xpath("//h4[text()='Sales']");
    private final By revenueGraphTitle = By.xpath("//h4[text()='Revenue (K)']");
    private final By trendChart = By.xpath("//canvas");
    private final By last7daysTitle = By.xpath("//p[text()='Last 7 days']");
    private final By last7daysReturn = By.xpath("//p[text()='Last 7 days']/following-sibling:: h2/" +
            "small/following-sibling:: span");
    private final By previousWeekTitle = By.xpath("//p[text()='Previous week']");
    private final By previousWeekReturn = By.xpath("//p[text()='Previous week']/following-sibling:: h2/" +
            "small/following-sibling:: span");
    private final By orderStatusLabel = By.xpath("//label[text()='Order Status']");
    private final By orderStatusDropDown = By.id("status-select");
    private final By orderSearchBox = By.id("orderToken");
    private final By showOrderBtn = By.xpath("//Button[text()='Show Order']");
    private final By filterTableBox = By.xpath("//input[@placeholder='Filter Table']");
    private final By filterTableRow = By.xpath("(//div[contains(@class,'MuiSelect-select')])[2]");
    private final By datePeriodBox = By.xpath("(//input[contains(@class,'MuiOutlinedInput-input')])[3]");
    private final By downloadCSVBtn = By.xpath("//button[text()='Download CSV']");
    private final By getTableHead1 = By.xpath("(//thead)[1]/tr/th/div");
    private final By getTableHead2 = By.xpath("(//thead)[1]/tr/th/span/div");
    private final By displayedTableRow = By.xpath("(//tbody)[1]/tr");

    public SalesPageObject(WebDriver driver){
        this.driver = driver;
    }


    public boolean verifyPageTitle() throws InterruptedException {
        return isElementDisplayed(salesPageTitle);
    }

    public boolean verifyTrendChart() throws InterruptedException {
        return isElementDisplayed(revenueGraphTitle) &&
                isElementDisplayed(trendChart) &&
                isElementDisplayed(last7daysTitle) &&
                isElementDisplayed(previousWeekTitle);
    }

    public String getLast7daysReturn() {
        return getTextFromElement(last7daysReturn);
    }

    public String getPreviousWeekReturn() {
        return getTextFromElement(previousWeekReturn);
    }

    public boolean verifyTableUtilsDisplayed() throws InterruptedException {
        return isElementDisplayed(orderStatusLabel) &&
                isElementDisplayed(orderStatusDropDown) &&
                isElementDisplayed(orderSearchBox) &&
                isElementDisplayed(showOrderBtn) &&
                isElementEnabled(filterTableBox) &&
                isElementDisplayed(filterTableRow) &&
                isElementEnabled(datePeriodBox) &&
                isElementDisplayed(downloadCSVBtn);
    }

    public ArrayList<String> tableHead() {
        List<WebElement> temp = driver.findElements(getTableHead1);
        ArrayList<String> tableHead = new ArrayList<>();
        for(WebElement e : temp) {
                tableHead.add(e.getText().toLowerCase());
        }
        temp = driver.findElements(getTableHead2);
        for(WebElement e : temp) {
            tableHead.add(e.getText().toLowerCase());
        }
        return tableHead;
    }

    public int filterRowNoToDisplay() {
        return Integer.parseInt(getTextFromElement(filterTableRow));
    }

    public int tableRowNo() {
        return driver.findElements(displayedTableRow).size();
    }
}
