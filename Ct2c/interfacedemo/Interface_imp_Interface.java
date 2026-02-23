package org.tns.capgemini.c2tc.interfacedemo;

interface Vehicle7
{
	void start();
	
	void stop();
}

interface Electrivehicle extends  Vehicle7
{
	void chargeBattery();
}

class Tesla implements Electrivehicle
{

	@Override
	public void start() {
		System.out.println("vehicle is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("vehicle is stopping");
		
	}

	@Override
	public void chargeBattery() {
		System.out.println("Battery is charged");
		
	}
	
}
public class Interface_imp_Interface {

	public static void main(String[] args) {
		Tesla tesla=new Tesla();
		tesla.start();
		tesla.stop();
		tesla.chargeBattery();
		

	}

}
