package keywordFiles;

import dataFiles.ProjectDataClass;
import pageObjectFiles.LoginPageObject;

import java.io.InputStream;
import java.util.Properties;

public class LoginKeyword {
    private final ProjectDataClass dataProvider;
    private final LoginPageObject loginPageObject;

    public LoginKeyword(ProjectDataClass dataProvider) {
        this.dataProvider = dataProvider;
        this.loginPageObject = new LoginPageObject(dataProvider.getDriver());
    }

    public void loginToApplication(String loginType) throws Exception {
        String resourceName="userData/userLoginData.properties";
        String feature = dataProvider.getFeatureName(dataProvider.getScenarioName());

        System.out.println("*** Using userLoginData sheet for " + feature + " feature execution***");

        //Load the required data sheet where uid and pw stored
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties props = new Properties();
        InputStream resourceStream = null;
        try {
            System.out.println("Resource path: " + resourceName);
            resourceStream = loader.getResourceAsStream(resourceName);
            props.load(resourceStream);
        } catch (Exception e) {
            System.out.println("Exception opening the properties file: " + e);
        }

        dataProvider.setUser(loginType);
        dataProvider.setUsername(props.getProperty(loginType + "." + "uid"));
        dataProvider.setPassword(props.getProperty(loginType + "." + "pw"));

        dataProvider.getScreenshot("openBrowserLandedOnLoginPage");
        loginPageObject.inputUserName(dataProvider.getUsername());
        loginPageObject.inputPassword(dataProvider.getPassword());
        dataProvider.getScreenshot("inputLoginDetails");
        loginPageObject.clickLoginBtn();

        dataProvider.getScreenshot("Login_Successful");

        if (null != resourceStream) {
            try {
                resourceStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
