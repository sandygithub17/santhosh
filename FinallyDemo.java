package santhosh;

import java.io.FileNotFoundException;

public class FinallyDemo {
	static void funcA() throws FileNotFoundException
	{
	try{
	System.out.println("inside funcA( )");
	throw new FileNotFoundException( );
	}
	finally{
	System.out.println
	("inside finally of funA( )");
	}
	}
	static void funcB() throws FileNotFoundException {
		try{
		System.out.println("inside funcB( )");
		throw new FileNotFoundException( );
		}
		finally{
		System.out.println
		("inside finally of funB( )");
		}
		}
	static void funcC() {
		try{
		System.out.println("inside funcC( )");
		}
		finally{
		System.out.println
		("inside finally of funcC( )");
		}
		}
	public static void main(String args[]){
		try{
			//funcA();
			funcB( );
		}
		catch (Exception e){
		System.out.println("Exception caught");
		}
	//	funcB( );
		funcC( );
		}
}
