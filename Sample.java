package santhosh;
final class GBase {
public  void display(String s)
{
System.out.println(s);
} }
public class Sample extends GBase{
	public void display(String s)
	{
	System.out.println(s);
	}
	public static void main(String args[]) {
	Sample ob = new Sample();
	ob.display("TRY ME");
	} 
	}
