package com.ivica.magentoid.core;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Model {

	protected static final MagentoidApp mApp = MagentoidApp.getInstance();
	protected static final Client client = MagentoidApp.client;
	protected static final Serializer serializer = new Persister();

}
