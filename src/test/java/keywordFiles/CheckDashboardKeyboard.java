package keywordFiles;

import dataFiles.ProjectDataClass;
import pageObjectFiles.CommonMenuPageObject;
import pageObjectFiles.SalesPageObject;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CheckDashboardKeyboard {
    private final ProjectDataClass dataProvider;
    private final CommonMenuPageObject commonMenuPageObject;
    private final SalesPageObject salesPageObject;
    private final ArrayList<String> tableHeadName;

    public CheckDashboardKeyboard(ProjectDataClass dataProvider) {
        this.dataProvider = dataProvider;
        this.commonMenuPageObject = new CommonMenuPageObject(dataProvider.getDriver());
        this.salesPageObject = new SalesPageObject(dataProvider.getDriver());
        this. tableHeadName = new ArrayList<>();
    }

    public void checkCommonMenu() throws InterruptedException {
        assertTrue("The commonMenu is not correctly displayed", commonMenuPageObject.verifyMenuExists());
    }

    public void checkSalePage() throws Exception {
        tableHeadName.add("merchant id");
        tableHeadName.add("status");
        tableHeadName.add("actions");
        tableHeadName.add("order date");
        tableHeadName.add("source");
        tableHeadName.add("order amount");

        assertTrue("Page title is not properly displayed", salesPageObject.verifyPageTitle());
        assertTrue("Trends Chart and its related item is not properly displayed", salesPageObject.verifyTrendChart());
        assertTrue("Table filter and related item is not properly displayed", salesPageObject.verifyTableUtilsDisplayed());
        assertEquals("Table's title is not properly displayed",tableHeadName,salesPageObject.tableHead());
        assertEquals("The last 7 days return value is not correct", salesPageObject.getLast7daysReturn(),salesPageObject.getLast7daysReturn());
        assertEquals("The previous week return value is not correct", salesPageObject.getPreviousWeekReturn(),salesPageObject.getPreviousWeekReturn());
        assertEquals("The row number getting displayed is incorrect", salesPageObject.filterRowNoToDisplay(),salesPageObject.tableRowNo());

        dataProvider.getScreenshot("finishCheckSalesPage");
    }
}
