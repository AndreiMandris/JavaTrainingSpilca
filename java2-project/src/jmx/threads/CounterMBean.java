package jmx.threads;

public interface CounterMBean { //the interface name has to respect this pattern (ending in MBean)
	
	void resetCounter();
	
	int getCounter();
	
	void setCounter(int counter);
	
	void count();

}
