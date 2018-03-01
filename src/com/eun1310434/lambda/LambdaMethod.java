/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.function.Supplier;

//클래스이름::static메서드
//객체이름::멤버메서드
//클래스형이름::메서드
//클래스이름::new

interface LambdaMethod_I{
	public void set(String key);
	public void print();
}

class LambdaMethod_C_a implements LambdaMethod_I{
	private String key;
	@Override
	public void set(String key) {
		this.key = key;
	}
	@Override
	public void print() {
		System.out.println("LambdaMethod_C_a : "+key);
	}
}

class LambdaMethod_C_b implements LambdaMethod_I{
	private String key;
	@Override
	public void set(String key) {
		this.key = key;
	}
	@Override
	public void print() {
		System.out.println("LambdaMethod_C_b : "+key);
	}
	
	public void printB() {
		System.out.println("LambdaMethod_C_b : printB : "+key);
	}
}

class LambdaMethod_MethodReference {
	public static <T extends LambdaMethod_I> T get(String str, Supplier<T> factory) {
		T obj = factory.get();
		obj.set(str);
		return obj;
	}
}
public class LambdaMethod {
	public static void main(String[] ar) {
		LambdaMethod_I i1 = LambdaMethod_MethodReference.get("김승현", LambdaMethod_C_a::new);
		LambdaMethod_C_b i2 = LambdaMethod_MethodReference.get("박승현", LambdaMethod_C_b::new);
		i1.print();
		//i2.print();
		i2.printB();
		System.out.println();
		
		String[] strings = new String[]{"D", "B", "A", "C"};
		Arrays.sort(strings, String::compareToIgnoreCase);
		//정렬 -> int java.lang.String.compareToIgnoreCase(String str)
		
		for(String s: strings) {System.out.print(s + "\t");}
	}
}
