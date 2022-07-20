package dataFiles;

import io.cucumber.core.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.DriverFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * This class will hold the data for Google Search test execution project.
 * It has getter and setter function only.
 */

public class ProjectDataClass {

    private ProjectDataClass dataInstance = null;

    private String username = "";
    private String password = "";
    private String userType = "";
    private String noAuthFlag = "";
    private String accessLevel = "Centric Admin"; //Admin - Client Services Group Authoriser - Advised
    private String representativeType = "BAS Advisor";
    private String bankingProvider = "ANZ Bank";
    private String company = "";

    private String email = "michael.han@centric.com.au";
    private String mobileNumber = "0491570156";

    //Data gen used data
    private String emailMacDataGen = "Michael.Han@centricwealth.com.au";
    private String mobileMacDataGen = "0478811653";
    private String emailWinDataGen = "Nathaniel.Tan@centricwealth.com.au";
    private String mobileWinDataGen = "0420406435";


    private String title = "Mr";
    private String firstName = "testFirstName";
    private String lastName = "testLastName";
    private String userDateOfBirth = "21/03/1966";

    private String address = "Unit 6 87-89 Lane St, WENTWORTHVILLE, NSW, 2145 ";
    private String addressLine1 = "13 Brolga Pl";
    private String addressLine2 = "Handford Park";
    private String addressLine3 = "";
    private String addressLine4 = "";
    private String suburb = "ZILLMERE";
    private String state = "QLD";
    private String postcode = "4034";
    private String userLevel = "";

    //New Advisor user details
    private String advisorCompany = "Findex Advice";
    private String advisorOffice = "SYDNEY";
    private String advisorCode = "12131231";
    private String advisorStatus = "Ceased";
    private String advisorDateCommenced = "28-Jan-1990";
    private String advisorClientSegment = "AS";
    private String advisorBusinessCountry = "Australia +61";
    private String advisorAreacode = "02";
    private String advisorBusinessContactNumber = "12345678";
    private String advisorMobileCountryCode = "Australia +61";
    private String advisorMobileNumber = "0491570156";
    private String advisorTitle = "Mr";
    private String advisorFirstName = "testFirstName";
    private String advisorLastName = "testLastName";
    private String advisorDateOfBirth = "16-Oct-1988";
    private String advisorPostalAddressCountry = "Australia";
    private String advisorPostalAddress = "Unit 6 87-89 Lane St, WENTWORTHVILLE, NSW, 2145";
    private String advisorResidentialAddressCountry = "Australia";
    private String advisorResidentialAddress = "Unit 6 87-89 Lane St, WENTWORTHVILLE, NSW, 2145";

    private String xhubUser = "No";
    private String companyUserAccount = "No";
    private String companyAccess = "Read Write";
    private String regionUser = "No";
    private String officeUser = "No";
    private String advisoruser = "No";
    private String accountPermission = "No";
    private String portfolioToAdd = "FA1006773";

    private String userID = "";
    private String wrapProvider = "No";
    private boolean isUserUpdated = false;
    private String portfolioType = "";

    // New Portfolio data
    private List<String> currentAccounts = null;
    private String portfolioName = "";
    private String clientAdviser = "FIAAAA0000130";
    private String bankAccountName = "Bank Account";
    private boolean portfolioOrg = false;
    private boolean hasMultipleSignatories = false;
    private String signatoriesType = "Jointly";
    private String portfolioSubtype = "";
    private int[] cashStratAllocation = {};
    private String acctAccess = "Read-Write";
    private String signatoryUserFlag = "Yes";
    private boolean sameClient = true;

    // Automation Adviser
    private String autoAdviserName = "AutomationDONOTUSE Robot";
    private String autoAdviserCode = "FIAAAA0000130";

    // Super Beneficiary Details
    private String benFirstName;
    private String benSurname;
    private String benBirthDay;
    private String benBirthMonth;
    private String benBirthYear;

    //Add Account
    private String selectedPortfolioID = "FA1006773";
    private boolean addAcctTest = false;

    private String organisationType = "Company";
    private String organisationName = "ABC News Company";

    private String clientFirstName = "";
    private String clientLastName = "";
    private String previousClientFirstName = "";
    boolean isClientUpdate = false;

    private String clientBirthDate = "1";
    private String clientBirthMonth = "Feb";
    private String clientBirthYear = "2000";
    private String clientBirthCountry = "Australia";
    private String dateOfIncorporation = "3";
    private String monthOfIncorporation = "Feb";
    private String yearOfIncorporation = "2015";
    private String australianBusinessNumber = "12965796462";
    private String industryClassification = "Professional Services";
    private String brandType = "Findex";

    private String country = "Australia";
    private String streetNumber = "87-89";
    private String streetName = "Lane St";
    private String streetType = "Street";

    private String emailType = "Personal";
    private String emailAddress = "michael.han@centric.com.au";
    private String preferredContact = "Email";

    private String TaxResidencyCountry = "Australia";
    private String taxFileNumber = "123456782";
    private String exemptGST = "Yes";
    private String CRSTaxClassification = "Active NFE";
    private String AMLSubOrg = "Partnerships";
    private String pepStatus = "Non-PEP";

    private String investorStatus = "No";
    private String thirdpartyDeposit = "No";
    private String identityVerification = "Yes";

    private String clientID = "";

    // Deposits and Withdrawals
    private String paidAccount;
    private String paidAmount;

    private int numOfClient = 0;
    private String clientRole = "";

    //Orders
    private String equities;
    private String bonds;
    private String mfs;
    private String tds;
    private ArrayList<String> orders = new ArrayList<>();
    private ArrayList<String> orderIDs = new ArrayList<>();

    //Transfers
    private String transferSource;
    private String transferDestination;
    private String transferAmount;
    private String transferDestinationCash;
    private String transferSourceCash;

    private String transferProvider;
    private String transferUnits;

    private String requestDate;
    private WebDriver driver;

    //Maintain Investment
    private String pdsDes;
    private String factSheetDes;
    private String tmdDes;
    private String overrideDoc;

    //D2C login
    private String clientUid;
    private String clientPw;
    private String clientSignatoryType;

    private ArrayList<String> investmentList = new ArrayList<>();
    private ArrayList<String> instrumentsValues = new ArrayList<>();
    private double previousPendingWithdraw;
    private String d2cPortfolioUsed;

    private String adHocNotificationTitle;

    //External Assets
    private int externalAssetPropertyValue;
    private int externalAssetInvestmentValue;
    private int externalAssetSuperValue;
    private int externalAssetOtherValue;
    private int externalAssetDebtValue;
    private double externalAssetTotalValue;

    //Super Docs
    private String issueID;
    private String superDocType;

    //Research
    private String defaultInstrumentCode = "ANZ.XASX.AU";

    /**
     * Method to get class object
     */
    private final DriverFactory driverFactory = new DriverFactory();
    private final String os = System.getProperty("os.name").toLowerCase();
    private String platform = System.getProperty("env.USER");
    private boolean checkDataGenFlag = false;
    private String url;
    private Scenario scenarioName;

    public String getFeatureName(Scenario scenario) {
        String[] rawFeatureName = scenario.getId().split(";")[0].
                replace("-"," ").split("/");
        return rawFeatureName[rawFeatureName.length-1].split("\\.")[0];
    }

    public String getOs(){
        return os;
    }

    public boolean getCheckDataGenFlag(){
        return checkDataGenFlag;
    }

    /**
     * Method to launch Browser
     */


    public void setTestEnvironment(String testRegion) {
        switch (testRegion.toUpperCase()) {
            case "UAT":
                url ="https://fnzoneadminofsu52.fnz.com/";
                break;
            case "TESTREGIONFNZ":
                url ="https://fnzoneadmintfsu4.fnz.com/";
                break;
            case "TESTREGION47":
            default:
                url = "https://fnzoneadminofsu47.fnz.com/";
                System.out.println("Test Environment has been set successfully.");
                break;
        }
    }
    /**
     * Method to launch URL
     */
    public void launchURL() {
        driver.get(url);
    }

    public void launchApplication(String browserName) throws MalformedURLException {
        launchBrowser(browserName);
        launchURL();
        System.out.println("Application launched successfully.");
    }
    /**
     * Method to take screenshots
     */
    public void getScreenshot(String fileName) throws Exception {
        Thread.sleep(2000);
        File scrFile;
        File destFile;

        if (platform.equalsIgnoreCase("local") && os.toLowerCase().contains("windows")) {
            new File("C:\\Screenshot\\" + scenarioName.getName());
            scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            destFile = new File("C:\\Screenshot\\" + scenarioName.getName() + "\\" + fileName + ".png");
        } else {
            new File("target/cucumber-reports/advanced-reports/screenshot/" + scenarioName.getName());
            scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            destFile = new File("target/cucumber-reports/advanced-reports/screenshot/"
                    + scenarioName.getName() + "/" + fileName + ".png");
        }
        if (!destFile.exists()) {
            FileUtils.copyFile(scrFile, destFile);
        }
        Thread.sleep(2000);
    }

    public void tearDown() throws IOException {
        File download = new File("src/test/resources/download");
//        String[]entries = download.list();
//        if(entries != null){
//            for(String s: entries){
//                File currentFile = new File(download.getPath(),s);
//                boolean downloadDirClean = currentFile.delete();
//                if(downloadDirClean)
//                    System.out.println("Downloaded files is being cleaned out!");
//                else
//                    System.out.println("There's no files in download.");
//            }
//        }
//        boolean downloadRemoved = download.delete();
//        if(downloadRemoved)
//            System.out.println("Download folder is being removed!");
//        else
//            System.out.println("Download folder does not exist.");
        FileUtils.deleteDirectory(download);
        System.out.println("Delete the download folder");
        driver.quit();
        driver = null;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void launchBrowser(String browserName) throws MalformedURLException {
        if(platform==null) {
            platform = "local";
        } else if(platform.contains("_")){
            checkDataGenFlag = platform.split("_")[1].equals("data");
            System.out.println(platform.split("_")[1]);
            if(checkDataGenFlag){
                System.out.println("+++++++++ Automation data generation begin +++++++++++");
            }
        }

        platform = platform.split("_")[0];
        String combo = platform.toUpperCase() + browserName.toUpperCase();

        switch (combo) {
            case "REMOTECHROME":
                driver = driverFactory.getDriver("RemoteChrome");
                break;

            case "LOCALFIREFOX":
                driver = driverFactory.getDriver("Firefox");
                break;

            case "DOCKERCHROME":
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
                break;

            default:
            case "LOCALCHROME":
                driver = driverFactory.getDriver("Chrome");
                break;
        }
        driver.manage().window().maximize();
    }

    public void setPortfolioType(String portfolioType) {
        String[] types = portfolioType.split(" ");
        this.portfolioType = types[0];
        System.out.println(types[0]);
        if (types.length > 1) {
            this.portfolioSubtype = types[1];
            System.out.println(types[1]);
        }
    }

    public void setOrders(ArrayList<String> orders) {
        for(String e : orders) {
            if(!e.contains("bank for"))
                this.orders.add(e);
            else
                this.orders.add("anz bank term deposit");
        }
    }

    public String getPathToTestFile() {
    File file = new File("src/test/resources/TestData/test.pdf");
    return file.getAbsolutePath();
    }

    public boolean getSameClientFlag() { return sameClient; }

    public void setSameClientFlag(String value) { this.sameClient = value.equalsIgnoreCase("yes");}

    public String getPlatform() { return platform; }

    public String getEmailMacDataGen() { return emailMacDataGen; }

    public String getMobileMacDataGen() { return mobileMacDataGen; }

    public String getEmailWinDataGen() { return emailWinDataGen; }

    public String getMobileWinDataGen() { return  mobileWinDataGen; }

    public void setOverrideDoc(String value) { this.overrideDoc = value; }

    public String getOverrideDoc() { return overrideDoc; }

    public void setPdsDes(String value) { this.pdsDes = value; }

    public String getPdsDes() { return pdsDes; }

    public void setFactSheetDes(String value) { this.factSheetDes = value; }

    public String getFactSheetDes() { return factSheetDes; }

    public void setTmdDes(String value) { this.tmdDes = value; }

    public String getTmdDes() { return tmdDes; }

    public void setSignatoryUserFlag(String value) { this.signatoryUserFlag = value; }

    public String getSignatoryUserFlag() { return signatoryUserFlag; }

    public void setD2CPortfolioUsed(String value) { this.d2cPortfolioUsed = value; }

    public String getD2CPortfolioUsed() { return d2cPortfolioUsed; }

    public void setPreviousPendingWithdraw(double previousPendingWithdraw){ this.previousPendingWithdraw = previousPendingWithdraw; }

    public double getPreviousPendingWithdraw() { return previousPendingWithdraw; }

    public void setInvestmentList(ArrayList<String> investmentList) { this.investmentList.addAll(investmentList); }

    public ArrayList<String> getInvestmentList() { return investmentList; }

    public void addInstrumentsValues(String instrumentsValues) { this.instrumentsValues.add(instrumentsValues); }

    public ArrayList<String> getInstrumentsValues() { return instrumentsValues; }

    public void setClientUid(String clientUid) { this.clientUid = clientUid; }

    public String getClientUid() { return clientUid; }

    public void setClientPw(String clientPw) { this.clientPw = clientPw; }

    public String getClientPw() { return clientPw; }

    public void setSignatoryType(String clientSignatoryType) { this.clientSignatoryType = clientSignatoryType; }

    public String getSignatoryType() { return clientSignatoryType; }

    public void setRequestDate(String requestDate) { this.requestDate = requestDate; }

    public String getRequestDate() { return requestDate; }

    public void setAddAcctTest(boolean addAcctTest) {this.addAcctTest = addAcctTest; }

    public boolean getAddAcctTest() { return addAcctTest; }

    public String getPortfolioToAdd() { return portfolioToAdd; }

    public ArrayList<String> getOrders() { return orders; }

    public void setOrderID(ArrayList<String> orderIDs) { this.orderIDs.addAll(orderIDs); }

    public ArrayList<String> getOrderIDs() { return orderIDs; }

    public void setEquities(String equities) {this.equities = equities; }

    public String getEquities() { return equities; }

    public void setScenarioName(Scenario scenarioName) { this.scenarioName = scenarioName; }

    public Scenario getScenarioName() { return scenarioName; }

    public void setBonds(String bonds) {this.bonds = bonds; }

    public String getBonds() { return bonds; }

    public void setMfs(String mfs) {this.mfs = mfs; }

    public String getMfs() { return mfs; }

    public void setTds(String tds) {this.tds = tds; }

    public String getTds() { return tds; }

    public void setNoAuthFlag(String noAuthFlag) { this.noAuthFlag = noAuthFlag; }

    public String getNoAuthFlag() { return noAuthFlag; }

    public boolean getAdvisorProductPermissions() { return true; }

    public void setClientRole(String clientRole) { this.clientRole = clientRole; }

    public String getClientRole() { return clientRole; }

    public void setNumOfClient(int numOfClient) { this.numOfClient = numOfClient; }

    public int getNumOfClient() { return numOfClient; }

    public void setSignatoriesType(String signatoriesType) { this.signatoriesType = signatoriesType; }

    public String getSignatoriesType() { return signatoriesType; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUserType() { return userType; }

    public void setUserType(String userType) { this.userType = userType; }

    public String getAccessLevel() { return accessLevel; }

    public void setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getBusinessCountry() { return "Australia +61"; }

    public String getAreacode() { return "1324"; }

    public String getBusinessContactNumber() { return "1234134"; }

    public String getMobileCountryCode() { return "Australia +61"; }

    public String getBankingProvider() { return bankingProvider; }

    public void setBankingProvider(String bankingProvider) { this.bankingProvider = bankingProvider; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUserDateOfBirth() { return userDateOfBirth; }

    public void setUserDateOfBirth(String userDateOfBirth) { this.userDateOfBirth = userDateOfBirth; }

    public String getAddressCountry() { return "Australia"; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getAddressLine1() { return addressLine1; }

    public void setAddressLine1(String addressLine1) { this.addressLine1 = addressLine1; }

    public String getAddressLine2() { return addressLine2; }

    public void setAddressLine2(String addressLine2) { this.addressLine2 = addressLine2; }

    public String getAddressLine3() { return addressLine3; }

    public void setAddressLine3(String addressLine3) { this.addressLine3 = addressLine3; }

    public String getAddressLine4() { return addressLine4; }

    public void setAddressLine4(String addressLine4) { this.addressLine4 = addressLine4; }

    public String getUserLevel() { return userLevel; }

    public void setUserLevel(String userLevel) { this.userLevel = userLevel; }

    public String getXhubUser() { return xhubUser; }

    public void setXhubUser(String xhubUser) { this.xhubUser = xhubUser; }

    public String getCompanyUserAccount() { return companyUserAccount; }

    public void setCompanyUserAccount(String companyUserAccount) { this.companyUserAccount = companyUserAccount; }

    public String getCompanyAccess() { return companyAccess; }

    public void setCompanyAccess(String companyAccess) { this.companyAccess = companyAccess; }

    public String getRegionUser() { return regionUser; }

    public void setRegionUser(String regionUser) { this.regionUser = regionUser; }

    public String getOfficeUser() { return officeUser; }

    public void setOfficeUser(String officeUser) { this.officeUser = officeUser; }

    public String getAdvisoruser() { return advisoruser; }

    public void setAdvisoruser(String advisoruser) { this.advisoruser = advisoruser; }

    public String getAccountPermission() { return accountPermission; }

    public void setAccountPermission(String accountPermission) { this.accountPermission = accountPermission; }

    public String getAcctAccess() { return acctAccess; }

    public void setAcctAccess(String acctAccess) { this.acctAccess = acctAccess; }

    public String getUserID() { return userID; }

    public void setUserID(String userID) { this.userID = userID; }

    public String getWrapProvider() { return wrapProvider; }

    public void setWrapProvider(String wrapProvider) { this.wrapProvider = wrapProvider; }

    public String getRepresentativeType() { return representativeType; }

    public void setRepresentativeType(String representativeType) { this.representativeType = representativeType; }

    public String getAdvisorCompany() { return advisorCompany; }

    public void setAdvisorCompany(String advisorCompany) { this.advisorCompany = advisorCompany; }

    public String getAdvisorOffice() { return advisorOffice; }

    public void setAdvisorOffice(String advisorOffice) { this.advisorOffice = advisorOffice; }

    public String getAdvisorCode() { return advisorCode; }

    public void setAdvisorCode(String advisorCode) { this.advisorCode = advisorCode; }

    public String getAdvisorStatus() { return advisorStatus; }

    public void setAdvisorStatus(String advisorStatus) { this.advisorStatus = advisorStatus; }

    public String getAdvisorDateCommenced() { return advisorDateCommenced; }

    public void setAdvisorDateCommenced(String advisorDateCommenced) { this.advisorDateCommenced = advisorDateCommenced; }

    public String getAdvisorCRMSystem() { return "Class,AdviceOS,Xplan"; }

    public String getAdvisorClientSegment() { return advisorClientSegment; }

    public void setAdvisorClientSegment(String advisorClientSegment) { this.advisorClientSegment = advisorClientSegment; }

    public String getAdvisorBusinessCountry() { return advisorBusinessCountry; }

    public void setAdvisorBusinessCountry(String advisorBusinessCountry) { this.advisorBusinessCountry = advisorBusinessCountry; }

    public String getAdvisorAreacode() { return advisorAreacode; }

    public void setAdvisorAreacode(String advisorAreacode) { this.advisorAreacode = advisorAreacode; }

    public String getAdvisorBusinessContactNumber() { return advisorBusinessContactNumber; }

    public void setAdvisorBusinessContactNumber(String advisorBusinessContactNumber) { this.advisorBusinessContactNumber = advisorBusinessContactNumber; }

    public String getAdvisorMobileCountryCode() { return advisorMobileCountryCode; }

    public void setAdvisorMobileCountryCode(String advisorMobileCountryCode) { this.advisorMobileCountryCode = advisorMobileCountryCode; }

    public String getAdvisorMobileNumber() { return advisorMobileNumber; }

    public void setAdvisorMobileNumber(String advisorMobileNumber) { this.advisorMobileNumber = advisorMobileNumber; }

    public String getAdvisorTitle() { return advisorTitle; }

    public void setAdvisorTitle(String advisorTitle) { this.advisorTitle = advisorTitle; }

    public String getAdvisorFirstName() { return advisorFirstName; }

    public void setAdvisorFirstName(String advisorFirstName) { this.advisorFirstName = advisorFirstName; }

    public String getAdvisorLastName() { return advisorLastName; }

    public void setAdvisorLastName(String advisorLastName) { this.advisorLastName = advisorLastName; }

    public String getAdvisorDateOfBirth() { return advisorDateOfBirth; }

    public void setAdvisorDateOfBirth(String advisorDateOfBirth) { this.advisorDateOfBirth = advisorDateOfBirth; }

    public String getAdvisorPostalAddressCountry() { return advisorPostalAddressCountry; }

    public void setAdvisorPostalAddressCountry(String advisorPostalAddressCountry) { this.advisorPostalAddressCountry = advisorPostalAddressCountry; }

    public String getAdvisorPostalAddress() { return advisorPostalAddress; }

    public void setAdvisorPostalAddress(String advisorPostalAddress) { this.advisorPostalAddress = advisorPostalAddress; }

    public String getAdvisorResidentialAddressCountry() { return advisorResidentialAddressCountry; }

    public void setAdvisorResidentialAddressCountry(String advisorResidentialAddressCountry) { this.advisorResidentialAddressCountry = advisorResidentialAddressCountry; }

    public String getAdvisorResidentialAddress() { return advisorResidentialAddress; }

    public void setAdvisorResidentialAddress(String advisorResidentialAddress) { this.advisorResidentialAddress = advisorResidentialAddress; }

    public boolean isUserUpdated() { return isUserUpdated; }

    public void setUserUpdated(boolean isUserUpdated) { this.isUserUpdated = isUserUpdated; }

    public String getPortfolioType() { return portfolioType; }

    public String getOrganisationType() { return organisationType; }

    public void setOrganisationType(String organisationType) { this.organisationType = organisationType; }

    public String getOrganisationName() { return organisationName; }

    public void setOrganisationName(String organisationName) { this.organisationName = organisationName; }

    public String getDateOfIncorporation() { return dateOfIncorporation; }

    public void setDateOfIncorporation(String dateOfIncorporation) { this.dateOfIncorporation = dateOfIncorporation; }

    public String getMonthOfIncorporation() { return monthOfIncorporation; }

    public void setMonthOfIncorporation(String monthOfIncorporation) { this.monthOfIncorporation = monthOfIncorporation; }

    public String getIndustryClassification() { return industryClassification; }

    public void setIndustryClassification(String industryClassification) { this.industryClassification = industryClassification; }

    public String getYearOfIncorporation() { return yearOfIncorporation; }

    public void setYearOfIncorporation(String yearOfIncorporation) { this.yearOfIncorporation = yearOfIncorporation; }

    public String getAustralianBusinessNumber() { return australianBusinessNumber; }

    public void setAustralianBusinessNumber(String australianBusinessNumber) { this.australianBusinessNumber = australianBusinessNumber; }

    public String getBrandType() { return brandType; }

    public String getClientBirthCountry(){ return clientBirthCountry; }

    public void setBrandType(String brandType) { this.brandType = brandType; }

    public String getStreetNumber() { return streetNumber; }

    public void setStreetNumber(String streetNumber) { this.streetNumber = streetNumber; }

    public String getStreetName() { return streetName; }

    public void setStreetName(String streetName) { this.streetName = streetName; }

    public String getStreetType() { return streetType; }

    public void setStreetType(String streetType) { this.streetType = streetType; }

    public String getSuburb() { return suburb; }

    public void setSuburb(String suburb) { this.suburb = suburb; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getPostcode() { return postcode; }

    public void setPostcode(String postcode) { this.postcode = postcode; }

    public String getEmailType() { return emailType; }

    public void setEmailType(String emailType) { this.emailType = emailType; }

    public String getEmailAddress() { return emailAddress; }

    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getMobileNumber() { return mobileNumber; }

    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getPreferredContact() { return preferredContact; }

    public void setPreferredContact(String preferredContact) { this.preferredContact = preferredContact; }

    public String getTaxResidencyCountry() { return TaxResidencyCountry; }

    public void setTaxResidencyCountry(String taxResidencyCountry) { TaxResidencyCountry = taxResidencyCountry; }

    public String getTaxFileNumber() { return taxFileNumber; }

    public void setTaxFileNumber(String taxFileNumber) { this.taxFileNumber = taxFileNumber; }

    public String getExemptGST() { return exemptGST; }

    public void setExemptGST(String exemptGST) { this.exemptGST = exemptGST; }

    public String getCRSTaxClassification() { return CRSTaxClassification; }

    public void setCRSTaxClassification(String cRSTaxClassification) { CRSTaxClassification = cRSTaxClassification; }

    public String getAmlCheckStatus() { return "Vetted"; }

    public String getAMLSubOrg() { return AMLSubOrg; }

    public void setAMLSubOrg(String aMLSubOrg) { AMLSubOrg = aMLSubOrg; }

    public String getAMLVerificationStatus() { return "Pass"; }

    public String getKYCCheckStatus() { return "Vetted"; }

    public String getKYCVerificationStatus() { return "ID verified"; }

    public String getClientFirstName() { return clientFirstName; }

    public void setClientFirstName(String clientFirstName) { this.clientFirstName = clientFirstName; }

    public String getClientLastName() { return clientLastName; }

    public void setClientLastName(String clientLastName) { this.clientLastName = clientLastName; }

    public String getClientBirthDate() { return clientBirthDate; }

    public void setClientBirthDate(String clientBirthDate) { this.clientBirthDate = clientBirthDate; }

    public String getClientBirthMonth() { return clientBirthMonth; }

    public void setClientBirthMonth(String clientBirthMonth) { this.clientBirthMonth = clientBirthMonth; }

    public String getClientBirthYear() { return clientBirthYear; }

    public void setClientBirthYear(String clientBirthYear) { this.clientBirthYear = clientBirthYear; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getGender() { return "Male"; }

    public String getInvestorStatus() { return investorStatus; }

    public void setInvestorStatus(String investorStatus) { this.investorStatus = investorStatus; }

    public String getThirdpartyDeposit() { return thirdpartyDeposit; }

    public void setThirdpartyDeposit(String thirdpartyDeposit) { this.thirdpartyDeposit = thirdpartyDeposit; }

    public String getIdentityVerification() { return identityVerification; }

    public void setIdentityVerification(String identityVerification) { this.identityVerification = identityVerification; }

    public String getPassportNumber() { return "A1111111"; }

    public String getIdOption1() { return "Australian Passport"; }

    public String getIdOption2() { return "Driver's Licence"; }

    public String getDriverLicenceNumber() { return "11111111"; }

    public String getPepStatus() { return pepStatus; }

    public void setPepStatus(String pepStatus) { this.pepStatus = pepStatus; }

    public String getPreviousClientFirstName() { return previousClientFirstName; }

    public void setPreviousClientFirstName(String previousClientFirstName) { this.previousClientFirstName = previousClientFirstName; }

    public boolean isClientUpdate() { return isClientUpdate; }

    public void setClientUpdate(boolean isClientUpdate) { this.isClientUpdate = isClientUpdate; }

    public void setClientID(String id) { this.clientID = id; }

    public String getClientID() { return clientID; }

    public List<String> getCurrentAccounts() { return currentAccounts; }

    public void setCurrentAccounts(List<String> currentAccounts) { this.currentAccounts = currentAccounts; }

    public void setPortfolioName(String name) { this.portfolioName = name; }

    public String getPortfolioName() { return portfolioName; }

    public String getBankAccountName() { return bankAccountName; }

    public String getBankAccountNumber() { return "12345678"; }

    public String getBankBSB() { return "062910"; }

    public void setClientAdviser(String adviser) { this.clientAdviser = adviser; }

    public String getClientAdviser() { return clientAdviser; }

    public boolean isPortfolioOrg() { return portfolioOrg; }

    public void setPortfolioOrg(boolean value) { this.portfolioOrg = value; }

    public void setHasMultipleSignatories(boolean value) { this.hasMultipleSignatories = value; }

    public boolean hasMultipleSignatories() { return hasMultipleSignatories; }

    public String getPortfolioSubtype() { return portfolioSubtype; }

    public void setCashStratAllocation(int[] allocations) { this.cashStratAllocation = allocations; }

    public int[] getCashStratAllocation() { return cashStratAllocation; }

    public String getAutoAdviserName() { return autoAdviserName; }

    public String getAutoAdviserCode() { return autoAdviserCode; }

    public void setAutoAdviserName(String autoAdviserName) { this.autoAdviserName = autoAdviserName; }

    public void setAutoAdviserCode(String autoAdviserCode) { this.autoAdviserCode = autoAdviserCode; }

    public String getSelectedPortfolioID() { return selectedPortfolioID; }

    public void setSelectedPortfolioID(String ID) { this.selectedPortfolioID = ID; }

    public void setBenFirstName(String name) { this.benFirstName = name; }

    public void setBenSurname(String name) { this.benSurname = name; }

    public void setBenBirthDay(String day) { this.benBirthDay = day; }

    public void setBenBirthMonth(String month) { this.benBirthMonth = month; }

    public void setBenBirthYear(String year) {this.benBirthYear = year; }

    public String getBenFirstName() { return benFirstName; }

    public String getBenSurname() { return benSurname; }

    public String getBenBirthDay() { return benBirthDay; }

    public String getBenBirthMonth() { return benBirthMonth; }

    public String getBenBirthYear() { return benBirthYear; }

    public void setPaidAccount(String account) { this.paidAccount = account; }

    public String getPaidAccount() { return paidAccount; }

    public void setPaidAmount(String amount) { this.paidAmount = amount; }

    public String getPaidAmount() { return paidAmount; }

    public String getTransferSource() { return transferSource; }

    public void setTransferSource(String transferSource) { this.transferSource = transferSource; }

    public String getTransferDestination() { return transferDestination; }

    public void setTransferDestination(String transferDest) { this.transferDestination = transferDest; }

    public String getTransferAmount() { return transferAmount; }

    public void setTransferAmount(String amount) { this.transferAmount = amount; }

    public void setTransferDestinationCash(String cash) { this.transferDestinationCash = cash; }

    public String getTransferDestinationCash() { return transferDestinationCash; }

    public void setTransferSourceCash(String cash) { this.transferSourceCash = cash; }

    public String getTransferSourceCash() { return transferSourceCash; }

    public void setTransferProvider(String provider) { this.transferProvider = provider; }

    public String getTransferProvider() { return transferProvider; }

    public void setTransferUnits(String units) { this.transferUnits = units; }

    public String getTransferUnits() { return transferUnits; }

    public void setAdHocNotificationTitle(String title) { this.adHocNotificationTitle = title; }

    public String getAdHocNotificationTitle() { return adHocNotificationTitle; }

    public void setExternalAssetPropertyValue(int value) { this.externalAssetPropertyValue = value; }

    public int getExternalAssetPropertyValue() { return externalAssetPropertyValue; }

    public void setExternalAssetInvestmentValue(int value) { this.externalAssetInvestmentValue = value; }

    public int getExternalAssetInvestmentValue() { return externalAssetInvestmentValue; }

    public void setExternalAssetSuperValue(int value) { this.externalAssetSuperValue = value; }

    public int getExternalAssetSuperValue() { return externalAssetSuperValue; }

    public void setExternalAssetOtherValue(int value) { this.externalAssetOtherValue = value; }

    public int getExternalAssetOtherValue() { return externalAssetOtherValue; }

    public void setExternalAssetDebtValue(int value) { this.externalAssetDebtValue = value; }

    public int getExternalAssetDebtValue() { return externalAssetDebtValue; }

    public void setExternalAssetTotalValue(float value) { this.externalAssetTotalValue = value; }

    public double getExternalAssetTotalValue() { return externalAssetTotalValue; }

    public void setIssueID(String id) { this.issueID = id; }

    public String getIssueID() { return issueID; }

    public void setSuperDocType(String doctype) { this.superDocType = doctype; }

    public String getSuperDocType() { return superDocType; }

    public String getDefaultInstrumentCode() { return defaultInstrumentCode; }
}