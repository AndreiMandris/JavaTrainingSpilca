package jmx.threads;

public class Counter implements CounterMBean{

	private int counter = 0;
	
	public void resetCounter() {
		counter = 0;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void count() {
		System.out.println("Counter = " + counter++);
	}

}
