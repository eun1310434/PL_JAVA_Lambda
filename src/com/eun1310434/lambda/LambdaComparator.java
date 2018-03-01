/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���, https://programmers.co.kr
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
�� Comparable �������̽� 
     �� ��ü�� �񱳸� ���� �������̽�
     �� ��ü���� ������ ���� �����ϰ� ����
     �� �����ϴ� ���
          - Comparable �������̽��� ��ü�񱳸� ������ Ŭ������ implements (���)
          - int compareTo(T o) �޼ҵ带 ������ 
            : ���������� ��ü�� ���Ͽ� ��� ������ ���������� ���ؼ� ����
            : ������ ��ü�� �ٸ���ü�� ��
              01) ��ȯ�Ǵ� �� 0 �� ���� ����
              02) ��ȯ�Ǵ� �� ��� �� ������ �ڿ� ��ġ
              03) ��ȯ�Ǵ� �� ���� �� ������ �տ� ��ġ
          - ���ϴ� ��ü
            : �ش� �޼ҵ带 ȣ���ϴ� ��ü
          - �񱳴��
            : ��ü�ڸ� ������ �ٸ� ��ü


�� Comparator �������̽� 
     �� ��ü�� �񱳸� ���� �������̽�Comparator
     �� ��ü���� ������ ���� �����ϰ� ����
     �� �����ϴ� ���
          - Comparator�������̽��� ��ü�񱳸� ������ Ŭ������ implements (���)
          - int compare(T o1, T o2) �޼ҵ带 ������
            : o1 ��ü�� o2 ��ü ��
              01) o1 ��ü�� o2 ��ü���� ������ �� �� ���
              02) o1 ��ü�� o2 ��ü���� ������ ���� �� 0, 
              03) o1 ��ü�� o2 ��ü���� ������ �� �� ����
          - ���ϴ� ��ü
            : o1
          - �񱳴��
            : o2


�� Comparable �� Comparator �������̽� ����
     �� ���ϴ� ���ؿ� ���� ������ �ٸ�
     �� Comparable
         - �ڱ��ڽŰ� ���� Ŭ���� Ÿ���� �ٸ���ü�� ���ϱ� ���ؼ� ���
     �� Comparator 
         - �ٸ� �ΰ��� ��ü�� ��
         - Comparator �� ������ ��ü�� �ٸ� �ΰ��� ��ü�� ���ϴ� ������ �Ǿ� �ΰ��� ��ü�� ��
         - �ַ� � Ư�� ��ü�� ���� ��ü���� �������� ������ �� ���
 */
