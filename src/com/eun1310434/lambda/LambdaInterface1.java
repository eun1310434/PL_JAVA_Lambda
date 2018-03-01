/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;
import java.util.ArrayList;
import java.util.List;
interface LambdaInterface1_I_check {
	boolean check(Integer n);
}
public class LambdaInterface1 {
	public static void printData(List<Integer> list, LambdaInterface1_I_check I) {
		for(Integer n: list) {
			//for(int n ; n < list.size(); n++)
			if(I.check(n)){
				System.out.println(n);	
			}
		}
	}
	public static void main(String[] ar) {
		List<Integer> list = new ArrayList<>();
		list.add(0); 
		list.add(1);
		list.add(2); 
		list.add(3); 
		list.add(4);
		
		System.out.println("Part A --------------------------");
		printData(
				list, 
				(Integer n) 
				-> { return n > 0 && n < 3; } 
				);
		
		

		System.out.println("Part B --------------------------");
		printData(
				list, 
				n 
				-> n > 0 && n < 3 
				);
	}
}
