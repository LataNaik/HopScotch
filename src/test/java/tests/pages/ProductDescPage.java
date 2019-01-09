package tests.pages;

import agent.IAgent;
import central.Configuration;

import java.util.Map;

public class ProductDescPage extends FullPage {
    public ProductDescPage(Configuration conf, IAgent agent, Map<String, String> testData) throws Exception {
        super(conf, agent, testData);
        assertPageLoad();
    }

    /**
     * Method to add multiple products by selecting age
     */
    public ProductDescPage multipleItemsAddToCart() throws Exception{
        getControl("btnSelectSize").click();
        getControl("rdo6To12Months").click();
        getControl("btnQuantity").click();
        swipeDown(3);
        getControl("btnAddToCart").click();
        return this;
    }

    /**
     * Scroll till Similar product text is visible
     */
    public ProductDescPage similarProducts() throws Exception{
        swipeDownTillElement("lblSimilarProduct");
        return this;
    }

}
