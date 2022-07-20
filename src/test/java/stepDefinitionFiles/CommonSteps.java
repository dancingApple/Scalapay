package stepDefinitionFiles;

import dataFiles.ProjectDataClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import util.CommonMethods;

public class Common_Steps extends CommonMethods {
    private Login_Keywords loginKeyword;
    private final ProjectDataClass dataProvider;


    public Common_Steps(ProjectDataClass dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Before
    public void BeforeHook(Scenario scenario) {
        dataProvider.setScenarioName(scenario);
        System.out.println("Scenario Name : " + dataProvider.getScenarioName().getName());
    }

    @After
    public void teardown() throws Exception {
        System.out.println("Test finished! Closing the test case");
        dataProvider.getScreenshot("Closing " + dataProvider.getScenarioName().getName());
        dataProvider.tearDown();
    }

    @Given("^The Environment is set as \"([^\"]*)\"$")
    public void the_Environment_is_set_as(String testEnvironment) {
        dataProvider.setTestEnvironment(testEnvironment);
    }

    @Given("^(.+) user login to centric admin portal$")
    public void something_user_login_to_centric_admin_portal(String userType) throws Throwable {
        loginKeyword.loginToApplication(userType);
    }


    @And("^The application is launched in \"([^\\\"]*)\"$")
    public void launchApplication(String browserName)
            throws Throwable {
        dataProvider.launchApplication(browserName);
        this.loginKeyword = new Login_Keywords(dataProvider);
    }
}