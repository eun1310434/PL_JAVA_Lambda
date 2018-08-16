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
  ¡Û Comparable 
    - This is called the class¡¯s ¡°natural ordering¡±.
    - It is an interface defining a strategy of comparing an object with 
      other objects of the same type.
    - "ClassName" implements Comparable<"ItemClassName"> 
    
  ¡Û Comparator
    - The Comparator interface defines a compare(arg1, arg2) method with two arguments 
      which represent compared objects and works similarly to the Comparable.compareTo() method.
    - "ClassComparatorName" implements Comparator<"ItemClassName"> 

  ¡Û LambdaComparator
    - ClassName::ClassMethodName
    - parameter->{return parameter * 10;};
    - (ClassName parameterA, ClassName parameterB)
      ->{return parameterA - parameterB;};
==================================================================================================*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ComparableItem implements Comparable<ComparableItem> {
	private Integer number;
	
	public ComparableItem(Integer n) {
		this.number = n;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void print(){
		System.out.print(this.number +"\t");
	}

	@Override
	public int compareTo(ComparableItem other) {
		return this.getNumber() - other.getNumber();
	}	
}


class Comparator_ASC implements Comparator<ComparableItem> {
	@Override
	public int compare(ComparableItem arg0, ComparableItem arg1) {
		// TODO Auto-generated method stub
		return arg0.getNumber() - arg1.getNumber();
	}
}

class Comparator_DESC implements Comparator<ComparableItem> {
	@Override
	public int compare(ComparableItem arg0, ComparableItem arg1) {
		// TODO Auto-generated method stub
		return arg1.getNumber() - arg0.getNumber();
	}
}

class Comparator_Tool {
	public int ASC(ComparableItem n1, ComparableItem n2) {
		return n1.getNumber() - n2.getNumber();
	}	
	
	public int DESC(ComparableItem n1, ComparableItem n2) {
		return n2.getNumber() - n1.getNumber();
	}
}


public class LambdaComparator {
	public static void main(String[] ar) {

		List<ComparableItem> numbers = Arrays.asList(
				new ComparableItem(4), 
				new ComparableItem(3),
				new ComparableItem(1), 
				new ComparableItem(2),
				new ComparableItem(5)
		);

		
		System.out.println("1-0 Comparable :: compareTo - ASC");
		numbers.sort(ComparableItem::compareTo);
		numbers.stream().forEach(ComparableItem::print);
		System.out.println("");System.out.println("");

		
		System.out.println("2-1 Comparator :: compare - ASC");
		numbers.sort(new Comparator_ASC()::compare); 
		numbers.sort(new Comparator_ASC());
		numbers.stream().forEach(ComparableItem::print);
		System.out.println("");System.out.println("");

		
		System.out.println("2-2 Comparator :: compare - DESC");
		numbers.sort(new Comparator_DESC()::compare);
		numbers.sort(new Comparator_DESC());
		numbers.stream().forEach(ComparableItem::print);		
		System.out.println("");System.out.println("");


		System.out.println("2-3 Comparator :: compareLambda - ASC");
		Comparator<ComparableItem> comparatorLambda_ASC
		 = (ComparableItem itemA, ComparableItem itemB) 
		    -> {return itemA.getNumber() - itemB.getNumber();};
		numbers.sort(comparatorLambda_ASC);
		numbers.stream().forEach(ComparableItem::print);		
		System.out.println("");System.out.println("");


		System.out.println("2-4 Comparator :: compareLambda - DESC");
		Comparator<ComparableItem> comparatorLambda_DESC
		 = (ComparableItem itemA, ComparableItem itemB) 
		    -> itemB.getNumber() - itemA.getNumber();
		numbers.sort(comparatorLambda_DESC);
		numbers.stream().forEach(ComparableItem::print);		
		System.out.println("");System.out.println("");
		

		System.out.println("3-1 static Compare :: ASC");
		numbers.sort(new Comparator_Tool()::ASC);	
		numbers.stream().forEach(ComparableItem::print);
		System.out.println("");System.out.println("");

		
		System.out.println("3-2 static Compare :: DESC");
		numbers.sort(new Comparator_Tool()::DESC);	
		numbers.stream().forEach(ComparableItem::print);
		System.out.println("");System.out.println("");
	
		
		System.out.println("4-1 string :: compareToIgnoreCase");
		String[] strings = new String[]{"D", "B", "A", "C","d","b","a","c"};
		Arrays.sort(strings, String::compareToIgnoreCase);
		Arrays.stream(strings).forEach(s -> {System.out.print(s + "\t");});
		System.out.println("");System.out.println("");
		
		
		System.out.println("4-2 string :: compareTo");
		Arrays.sort(strings, String::compareTo);
		Arrays.stream(strings).forEach(s -> {System.out.print(s + "\t");});
	}
}
