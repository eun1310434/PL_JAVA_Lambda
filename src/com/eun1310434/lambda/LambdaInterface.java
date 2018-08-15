/*==================================================================================================
¡à INFORMATION
  ¡Û Data : 15.08.2018
  ¡Û Mail : eun1310434@naver.com
  ¡Û WebPage : https://eun1310434.github.io/
  ¡Û Reference
     - Hello Java Programming
     
¡à FUNCTION
  ¡Û 
   
¡à Study
  ¡Û LambdaInterface
   - 
==================================================================================================*/
package com.eun1310434.lambda;

interface LambdaInterface_I {
	public int method(int value1, int value2);
}

public class LambdaInterface {

	public static void exec(int a, int b, LambdaInterface_I I) {
		int value = I.method(a, b);
		System.out.println(value);
	}

	public static void main(String[] args) {

		// DeclareA - Basic
		LambdaInterface_I I_A = new LambdaInterface_I() {
			@Override
			public int method(int value1, int value2) {
				// TODO Auto-generated method stub
				return value1 - value2;
			}
		};
		
		exec(10, 5, I_A);

		// DeclareB - AnonymousClass
		exec(10, 5, new LambdaInterface_I() {
			@Override
			public int method(int i, int j) {
				// TODO Auto-generated method stub
				return i - j;
			}
		});

		// DeclareC - Lambda
		exec(10, 5, (i, j) -> {
			return i - j;
		});
	}
}
