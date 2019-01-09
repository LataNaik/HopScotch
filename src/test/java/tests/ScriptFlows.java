package tests;

import central.AppachhiCentral;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ScriptFlows extends SupportTest {
    private ITestContext context = null;

    @Test(groups = { "Hopscotch" }, description = "SearchDressScrollTillEndOfThePage", alwaysRun = true)
    public void HS_14() throws Exception {
        logger.debug(this.getTestStartInfoMessage("HS_14"));
        home.splashToHome().searchDresses();
        logger.debug(this.getTestEndInfoMessage("HS_14"));
    }

    @Test(groups = { "Hopscotch" }, description = "HS_15", alwaysRun = true)
    public void HS_15() throws Exception {
        logger.debug(this.getTestStartInfoMessage("HS_15"));
        home.splashToHome().moveToBoutique().lastProduct().similarProducts();
        logger.debug(this.getTestEndInfoMessage("HS_15"));
    }

    @Test(groups = { "Hopscotch" }, description = "HS_16", alwaysRun = true)
    public void HS_16() throws Exception {
        logger.debug(this.getTestStartInfoMessage("HS_16"));
        home.splashToHome().moveToBoutique().listToDesc().multipleItemsAddToCart();
        logger.debug(this.getTestEndInfoMessage("HS_16"));
    }

   @Test(groups = { "Hopscotch" }, description = "HS_20", alwaysRun = true)
    public void HS_20() throws Exception {
        logger.debug(this.getTestStartInfoMessage("HS_20"));
        home.splashToHome().moveToBoutique().goBackAndVerifyBoutique();
        logger.debug(this.getTestEndInfoMessage("HS_20"));
    }

}
