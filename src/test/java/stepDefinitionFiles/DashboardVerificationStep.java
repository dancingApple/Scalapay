package stepDefinitionFiles;

import dataFiles.ProjectDataClass;
import io.cucumber.java.en.Then;
import keywordFiles.CheckDashboardKeyboard;

public class DashboardVerificationStep {

    private CheckDashboardKeyboard checkDashboardKeyboard;

    public DashboardVerificationStep(ProjectDataClass dataProvider) {
        this.checkDashboardKeyboard = new CheckDashboardKeyboard(dataProvider);
    }
    @Then("^user successfully landed on dashboard screen$")
    public void user_successfully_landed_on_dashboard_screen() throws Throwable {
        checkDashboardKeyboard.checkCommonMenu();
        checkDashboardKeyboard.checkSalePage();
    }
}
