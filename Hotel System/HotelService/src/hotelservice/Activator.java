package hotelservice;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator, ServiceListener {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("=====================================");
		System.out.println("   Hotel Service Activated   ");
		System.out.println("=====================================");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println(" ");
		System.out.println("  Hotel Service Deactivated ");
		System.out.println("=====================================");
	}

	@Override
	public void serviceChanged(ServiceEvent arg0) {
			
	}

}
