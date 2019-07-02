package jmx.threads;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class MainClass {
	public static void main(String[] args) throws InterruptedException, MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException {
		
		Counter counter = new Counter();
		
		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName objectName = new ObjectName("name.jmx:type=CounterMBean"); // I can give any name I want
		mbs.registerMBean(counter, objectName);
		
		doSomeCounting(counter);
		
	}

	private static void doSomeCounting(Counter counter) throws InterruptedException {
		for (int i=0; i<100; i++) {
			counter.count();
			Thread.sleep(1000);
		}
	}
}
