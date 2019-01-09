package tests.pages;

import java.util.Map;

import agent.IAgent;
import central.Configuration;
import page.Page;

public abstract  class FullPage extends Page {

	public FullPage(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
	}
}
