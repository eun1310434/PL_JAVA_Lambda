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
  ¡Û LambdaComparator
   - 
==================================================================================================*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class LambdaComparator_class implements Comparable<LambdaComparator_class> {
	private Integer number;
	
	public LambdaComparator_class(Integer n) {
		this.number = n;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void print(){
		System.out.print(this.number +"\t");
	}

	@Override
	public int compareTo(LambdaComparator_class other) {
		return this.getNumber() - other.getNumber();
	}	
	
	public static int ASC(LambdaComparator_class n1, LambdaComparator_class n2) {
		return n1.getNumber() - n2.getNumber();
	}	
	
	public static int DESC(LambdaComparator_class n1, LambdaComparator_class n2) {
		return n2.getNumber() - n1.getNumber();
	}
}

class LambdaComparator_ASC implements Comparator<LambdaComparator_class> {
	@Override
	public int compare(LambdaComparator_class arg0, LambdaComparator_class arg1) {
		// TODO Auto-generated method stub
		return arg0.getNumber() - arg1.getNumber();
	}
}

class LambdaComparator_DESC implements Comparator<LambdaComparator_class> {
	@Override
	public int compare(LambdaComparator_class arg0, LambdaComparator_class arg1) {
		// TODO Auto-generated method stub
		return arg1.getNumber() - arg0.getNumber();
	}
}


public class LambdaComparator {
	public static void main(String[] ar) {

		List<LambdaComparator_class> numbers = Arrays.asList(
				new LambdaComparator_class(4), 
				new LambdaComparator_class(3),
				new LambdaComparator_class(1), 
				new LambdaComparator_class(2),
				new LambdaComparator_class(5)
		);
		
		System.out.println("1-1 Comparator :: compare - ASC");
		numbers.sort(new LambdaComparator_ASC());	
		numbers.stream().forEach(LambdaComparator_class::print);
		System.out.println("");System.out.println("");

		System.out.println("1-2 Comparator :: compare - DESC");
		numbers.sort(new LambdaComparator_DESC());
		numbers.stream().forEach(LambdaComparator_class::print);		
		System.out.println("");System.out.println("");

		System.out.println("3-0 Comparable :: compareTo - ASC");
		numbers.sort(LambdaComparator_class::compareTo);	
		numbers.stream().forEach(LambdaComparator_class::print);
		System.out.println("");System.out.println("");

		System.out.println("4-1 static Compare :: ASC");
		numbers.sort(LambdaComparator_class::ASC);	
		numbers.stream().forEach(LambdaComparator_class::print);
		System.out.println("");System.out.println("");

		System.out.println("4-2 static Compare :: DESC");
		numbers.sort(LambdaComparator_class::DESC);	
		numbers.stream().forEach(LambdaComparator_class::print);
		System.out.println("");System.out.println("");
		

		System.out.println("5-0 string :: compareToIgnoreCase");
		String[] strings = new String[]{"D", "B", "A", "C"};
		Arrays.sort(strings, String::compareToIgnoreCase);
		Arrays.stream(strings).forEach(s -> {System.out.print(s + "\t");});
	}
}
