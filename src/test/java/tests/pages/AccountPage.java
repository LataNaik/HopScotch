package tests.pages;

import agent.IAgent;
import central.Configuration;

import java.util.Map;

public class AccountPage extends FullPage {
    public AccountPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
        super(conf, agent, testData);
        assertPageLoad();
    }

    /**
     * Method for New Registration
     * Register parameters taken from ini file
     */
    public AccountPage register() throws Exception{
        getControl("lnkJoinUs").click();
        getControl("txtFullName").click();
        getControl("txtEditFullName").enterText(getTestData().get("FullName"));
        getControl("txtEmailAddress").click();
        getControl("txtEmailAddress").enterText(getTestData().get("EmailAddress"));
        getControl("txtMobileNumber").click();
        getControl("txtMobileNumber").enterText(getTestData().get("MobileNumber"));
        getControl("btnSendOTP").click();
        getControl("txtEnterOTP").enterText(getTestData().get("OTP"));
        return this;
    }

    /**
     *  Method to View Profile DetailsS
     */
    public void profileDetails() throws Exception{
        getControl("btnProfileDetails").click();
    }
}
