package com.mtit.eventservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publshServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {

		ServicePublish publisherSevice = new ServicePublishImpl();
		publshServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherSevice, null);
		System.out.println("====================================");
		System.out.println("     Event Service Publisher Started      ");
		System.out.println("====================================");

	}

	public void stop(BundleContext bundleContext) throws Exception {
		publshServiceRegistration.unregister();
		System.out.println("=====================================");
		System.out.println("     Event Service Publisher Stopped      ");
		System.out.println("=====================================");
	}

}
