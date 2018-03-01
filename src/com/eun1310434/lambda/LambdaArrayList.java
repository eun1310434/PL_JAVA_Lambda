/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class LambdaArrayList_Info {
	private String key;
	private int value;
	public LambdaArrayList_Info(String _key, int _value){
		this.key = _key;
		this.value = _value;
	}

	public String stringOut() {
		return key;
	}

	public Integer integerOut() {
		return value;
	}
	
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}
public class LambdaArrayList {
	public static void main(String[] ar) {
		List<LambdaArrayList_Info> list = new ArrayList<>();
		list.add(new LambdaArrayList_Info("a", 5));
		list.add(new LambdaArrayList_Info("b", 4));
		list.add(new LambdaArrayList_Info("c", 3));
		list.add(new LambdaArrayList_Info("d", 2));
		list.add(new LambdaArrayList_Info("e", 1));
		
		list.stream()
		.filter(p -> p.integerOut() >= 3 && p.integerOut() <= 5)
		.forEach(p -> p.display());
		
		System.out.println();
		
		List<String> names = list.stream()
				.filter(p -> p.integerOut() >= 1 && p.integerOut() <= 3)
				.map(LambdaArrayList_Info::stringOut)
				.collect(Collectors.toList());
		names.forEach(n -> System.out.print(n + "\t"));
	}
}
