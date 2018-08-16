/*==================================================================================================
¡à INFORMATION
  ¡Û Data : 16.08.2018
  ¡Û Mail : eun1310434@naver.com
  ¡Û WebPage : https://eun1310434.github.io/
  ¡Û Reference
     - Hello Java Programming
     - https://www.baeldung.com/java-comparator-comparable
     
¡à FUNCTION
  ¡Û 
   
¡à Study
  ¡Û LambdaInterface
    - parameter->{return parameter * 10;};
    - (ClassName parameterA, ClassName parameterB)
      -> {return parameterA - parameterB;};
==================================================================================================*/
package com.eun1310434.lambda;

interface LambdaInterface_integer {
	public int method(int value1, int value2); 
}

interface LambdaInterface_boolean {
	public boolean method(int value1, int value2); 
}

interface LambdaInterface_void {
	public void method(); 
}

public class LambdaInterface {

	public static void exec_integer(int a, int b, LambdaInterface_integer I) {
		int value = I.method(a, b);
		System.out.println(value);
	}
	
	public static void exec_boolean(int a, int b, LambdaInterface_boolean I) {
		boolean value = I.method(a, b);
		System.out.println(value);
	}
	
	public static void exec_void(int a, int b, LambdaInterface_void I) {
		I.method();
	}
	
	
	public static void main(String[] args) {

		//1-0) Basic
		System.out.println("1-0) Basic - Declare A");
		LambdaInterface_integer I_A = new LambdaInterface_integer() {
			@Override
			public int method(int value1, int value2) {
				// TODO Auto-generated method stub
				return value1 - value2;
			}
		};
		exec_integer(10, 5, I_A);
		System.out.println("");

		//2-0) AnonymousClass
		System.out.println("2-0) AnonymousClass");
		exec_integer(10, 5, new LambdaInterface_integer() {
			@Override
			public int method(int i, int j) {
				// TODO Auto-generated method stub
				return i - j;
			}
		});
		System.out.println("");

		//3-1) Lambda - integer
		System.out.println("3-1) Lambda - integer");
		exec_integer(10, 5, (i, j) -> {return i - j;});
		System.out.println("");
		

		//3-2) Lambda - integer
		System.out.println("3-2) Lambda - integer");
		exec_integer(10, 5, (i, j) -> i - j);
		System.out.println("");
		
		//4-1) Lambda - boolean
		System.out.println("4-1) Lambda - boolean");
		exec_boolean(10, 2, (i, j) -> { return i > 0 && j < 3;});
		System.out.println("");

		//4-2) Lambda - boolean
		System.out.println("4-2) Lambda - boolean");
		exec_boolean(10, 2, (i, j) -> i > 0 && j < 3);
		System.out.println("");
		
		//5-0) Lambda - void
		System.out.println("5-1) Lambda - void");
		exec_void(10, 2, () -> System.out.println("Lambda - void"));
		System.out.println("");
	}
}


