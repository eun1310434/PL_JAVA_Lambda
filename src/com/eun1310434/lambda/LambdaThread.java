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
  ¡Û LambdaThread
    - new Runnable() {public void run() {}} == () -> {}
==================================================================================================*/
package com.eun1310434.lambda;

public class LambdaThread {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Basic use : "+i);
				}
			}
		}).start();

		
		new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("lambda Thread use : "+i);
			}
		}).start();
	}
}
