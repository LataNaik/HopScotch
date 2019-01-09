package tests.pages;

import agent.IAgent;
import central.Configuration;
import java.util.Map;

public class HomePage extends FullPage {

    public HomePage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
        super(conf, agent, testData);
        assertPageLoad();
    }

    /**
     *  Method to navigate from Home screen to Account
     */
    public AccountPage moveToAccount() throws Exception {
        logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
        getControl("icoAccount").click();
        return new AccountPage(getConfig(), getAgent(), getTestData());
    }

    /**
     * Scroll down till the last product
     */
    public HomePage scrollDownHomePage() throws Exception{
        logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
        swipeDownTillElement("txtAileRabbit");
        return this;
    }

    /**
     * Navigating to Boutique list
     */
    public ProductListPage moveToBoutique() throws Exception{
        getControl("imgBoutique").click();
        return new ProductListPage(getConfig(), getAgent(), getTestData());
    }

    /**
     * Navigating to Home screen after installation
     */
    public HomePage splashToHome() throws Exception{
        logger.debug(String.format("(%s) Logging in...", this.getPlatform()));
        getControl("icnGender").click();
        getControl("btnAge").click();
        getControl("txtCoachMask").click();
        return this;
    }

    /**
     * Close existing session and relaunching app
     */
    public void closeAndRelaunch()throws Exception{
        goBack();
        goBack();
    }

    /**
     * Method to Search
     * Search parameter taken from ini file
     */
    public HomePage searchDresses()throws Exception{
        getControl("icoSearch").click();
        getControl("txtSearchHopscotch").click();
        getControl("txtEditSearchHopscotch").enterText(getTestData().get("SearchText"));
        getControl("txtSearchResult").click();
        swipeDownTillElement("imgMidProduct");
        return this;
    }
}
