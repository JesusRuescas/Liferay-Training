package com.liferay.training.hello.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloBundleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
