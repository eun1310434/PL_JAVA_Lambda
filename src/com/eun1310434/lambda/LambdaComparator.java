/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.Comparator;
class LambdaComparator_C{
	private Integer number;
	
	public LambdaComparator_C(Integer n) {
		this.number = n;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void print(){
		System.out.println(this.number);
	}
	
	public void ADD_print(int add){
		System.out.println(this.number+add);
	}
	
	public static int ASC(LambdaComparator_C n1, LambdaComparator_C n2) {
		return n1.getNumber() - n2.getNumber();
	}	
	
	public static int DESC(LambdaComparator_C n1, LambdaComparator_C n2) {
		return n2.getNumber() - n1.getNumber();
	}	
}

class LambdaComparator_ASC implements Comparator<LambdaComparator_C> {
	@Override
	public int compare(LambdaComparator_C arg0, LambdaComparator_C arg1) {
		// TODO Auto-generated method stub
		return arg0.getNumber() - arg1.getNumber();
	}
}

class LambdaComparator_DESC implements Comparator<LambdaComparator_C> {
	@Override
	public int compare(LambdaComparator_C arg0, LambdaComparator_C arg1) {
		// TODO Auto-generated method stub
		return arg1.getNumber() - arg0.getNumber();
	}
}


public class LambdaComparator {
	public static void main(String[] ar) {
		LambdaComparator_C[] numbers = new LambdaComparator_C[] {
			new LambdaComparator_C(4), 
			new LambdaComparator_C(3),
			new LambdaComparator_C(1), 
			new LambdaComparator_C(2),
			new LambdaComparator_C(5)
		};

		System.out.println("new LambdaComparator_ASC");
		Arrays.sort(numbers, new LambdaComparator_ASC());	
		Arrays.stream(numbers).forEach(LambdaComparator_C::print);
		//Arrays.stream(numbers).forEach(LambdaComparator_C -> LambdaComparator_C.print());
		//for(LambdaComparator_C n: numbers) {n.print();}
		

		System.out.println("new LambdaComparator_DESC");
		Arrays.sort(numbers, new LambdaComparator_DESC());
		Arrays.stream(numbers).forEach(LambdaComparator_C::print);
		//Arrays.stream(numbers).forEach(LambdaComparator_C -> LambdaComparator_C.print());
		//for(LambdaComparator_C n: numbers) {n.print();}
		
		System.out.println("LambdaComparator_C::ASC");
		Arrays.sort(numbers, LambdaComparator_C::ASC);	
		Arrays.stream(numbers).forEach(LambdaComparator_C::print);
		//Arrays.stream(numbers).forEach(LambdaComparator_C -> LambdaComparator_C.print());
		//for(LambdaComparator_C n: numbers) {n.print();}

		System.out.println("LambdaComparator_C::DESC");
		Arrays.sort(numbers, LambdaComparator_C::DESC);	
		Arrays.stream(numbers).forEach(LambdaComparator_C::print);
		//Arrays.stream(numbers).forEach(LambdaComparator_C -> LambdaComparator_C.print());
		//for(LambdaComparator_C n: numbers) {n.print();}
	}
}

/*
□ Comparable 인터페이스 
     ○ 객체의 비교를 위한 인터페이스
     ○ 객체간에 순서나 정렬 가능하게 도움
     ○ 구현하는 방법
          - Comparable 인터페이스를 객체비교를 구현할 클래스에 implements (상속)
          - int compareTo(T o) 메소드를 재정의 
            : 내부적으로 객체를 비교하여 어떻게 순서가 정해질지에 대해서 구현
            : 현재의 객체가 다른객체와 비교
              01) 반환되는 값 0 → 순서 같음
              02) 반환되는 값 양수 → 순서가 뒤에 위치
              03) 반환되는 값 음수 → 순서가 앞에 위치
          - 비교하는 주체
            : 해당 메소드를 호출하는 객체
          - 비교대상
            : 주체자를 제외한 다른 객체


□ Comparator 인터페이스 
     ○ 객체의 비교를 위한 인터페이스Comparator
     ○ 객체간에 순서나 정렬 가능하게 도움
     ○ 구현하는 방법
          - Comparator인터페이스를 객체비교를 구현할 클래스에 implements (상속)
          - int compare(T o1, T o2) 메소드를 재정의
            : o1 객체와 o2 객체 비교
              01) o1 객체와 o2 객체보다 순서가 앞 → 양수
              02) o1 객체와 o2 객체보다 순서가 같음 → 0, 
              03) o1 객체와 o2 객체보다 순서가 뒤 → 음수
          - 비교하는 주체
            : o1
          - 비교대상
            : o2


□ Comparable 와 Comparator 인터페이스 차이
     ○ 비교하는 기준에 따라서 정렬이 다름
     ○ Comparable
         - 자기자신과 같은 클래스 타입의 다른객체와 비교하기 위해서 사용
     ○ Comparator 
         - 다른 두개의 객체를 비교
         - Comparator 를 구현한 객체가 다른 두개의 객체를 비교하는 기준이 되어 두개의 객체를 비교
         - 주로 어떤 특정 객체에 대한 객체비교의 기준점을 제시할 때 사용
 */
