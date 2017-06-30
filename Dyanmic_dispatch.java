package santhosh;
class BigB {
public void role() {
System.out.println(" My name is BigB");
}
}
class FatherRole extends BigB
{
// child class is overriding the role() method
public void role(){
System.out.println("My role is Father when I amwith my son !");
}
}
class DriverRole extends BigB{
	//child class is overriding the name() method
	public void role(){
	System.out.println(" My role is Driver when I amdriving a car!");
	}
	}
	class CEORole extends BigB{
	//child class is overriding the name() method
	public void role(){
	System.out.println(" My role is CEO when I am inside my own company ");
	}
	}
	
public class Dyanmic_dispatch {

	public static void main(String[] args) {
		
		System.out.println(" To demonstrate Runtime Polymorphism: ");
				BigB v;
				// Parent class reference variable can point to
				// any of its CHILD class objects....
				v = new BigB(); v.role();
				v= new FatherRole(); v.role();
				v= new DriverRole(); v.role();
				v= new CEORole(); v.role();
				}
}
