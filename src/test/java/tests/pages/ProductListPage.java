package tests.pages;

import agent.IAgent;
import central.Configuration;

import java.util.Map;

public class ProductListPage extends FullPage {
    public ProductListPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
        super(conf, agent, testData);
        assertPageLoad();
    }

    /**
     * Selecting first product and navigating to description page from list page
     */
    public ProductDescPage listToDesc() throws Exception{
        getControl("imgProductLink").click();
        return new ProductDescPage(getConfig(), getAgent(), getTestData());
    }

    /**
     * Selecting the last product from the list
     */
    public ProductDescPage lastProduct() throws Exception{
        swipeDownTillElement("txtLastProduct");
        getControl("txtLastProduct").click();
        return new ProductDescPage(getConfig(), getAgent(), getTestData());
    }

    /**
     * Verifying Boutique after navigating back from product list
     */
    public ProductListPage goBackAndVerifyBoutique()throws Exception{
        goBack();
        swipeDownTillElement("txtAileRabbit");
        return this;
    }
}
