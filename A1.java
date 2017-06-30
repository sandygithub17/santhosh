package santhosh;
interface IntDemo{
void display();
}
class classOne implements IntDemo{
void add(int x, int y){
System.out.println("The sum is :" +(x+y));
}
public void display(){
System.out.println("Welcome to Interfaces");
}
}
class classTwo implements IntDemo{
void multiply(int i,int j, int k) {
System.out.println("The result:" +(i*j*k) );
}
public void display(){
System.out.println("Welcome to Java ");
}
}
public class A1 {
	public static void main(String args[]) {
		
		IntDemo c2 = new classTwo();
		//c2.multiply(5,10,5);
		c2.display();
		}
}
