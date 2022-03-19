package resturantservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
	
		ServicePublish publisherSevice = new ServicePublishImpl();
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherSevice, null);
		System.out.println("Resturant Service Publisher Started");
	}

	public void stop(BundleContext context) throws Exception {
	
		publishServiceRegistration.unregister();
		System.out.println("Resturant Service Publisher Stopped");
	}

}
