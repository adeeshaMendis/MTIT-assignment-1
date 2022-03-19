package com.mtit.eventservicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.eventservicepublisher.ServicePublish;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)context.getService(serviceReference);
		System.out.println("Subscriber Service Started");
		servicePublish.publishService();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Subscriber Service Stop");
		context.ungetService(serviceReference);
	}
}
