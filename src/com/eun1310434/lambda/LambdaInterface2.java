/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;
interface LambdaInterface2_I_a {
	void print();
}

interface LambdaInterface2_I_b {
	void print(int x);
}

interface LambdaInterface2_I_c {
	void print(Integer key, String value);
}

public class LambdaInterface2 {
	public static void main(String[] ar) {
		System.out.println("Part A --------------------------");
		LambdaInterface2_I_a a 
		= () -> System.out.println("print");
		//() : void
		a.print();

		
		System.out.println("Part B --------------------------");
		LambdaInterface2_I_b b 
		= x -> System.out.println("print - x = " + x);
		//x : Integer
		b.print(100);
		
		
		System.out.println("Part C --------------------------");
		LambdaInterface2_I_c c 
		= (k, v) -> {
			//k : Integer
			//v : String
			System.out.println("print - key = " + k);
			System.out.println("print - value = " + v);
			return;
		};
		c.print(1, "김승현");
		
	}
}
