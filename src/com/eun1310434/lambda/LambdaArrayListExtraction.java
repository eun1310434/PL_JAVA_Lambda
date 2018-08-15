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
  ¡Û Lambda ArrayList
   - 
==================================================================================================*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class LambdaArrayListExtraction_Info {
	private String key;
	private int value;
	public LambdaArrayListExtraction_Info (String _key, int _value){
		this.key = _key;
		this.value = _value;
	}

	public String keyOut() {
		return key;
	}

	public Integer valueOut() {
		return value;
	}
	
	public void display(){
		System.out.println("key = " +key+ ", value = " +value);
	}
}

public class LambdaArrayListExtraction {
	public static void main(String[] ar) {
		
		//Declare List : Efficient coding
		List<LambdaArrayListExtraction_Info> list = Arrays.asList(
				new LambdaArrayListExtraction_Info("a", 1),
				new LambdaArrayListExtraction_Info("a", 2),
				new LambdaArrayListExtraction_Info("a", 3),
				new LambdaArrayListExtraction_Info("b", 1),
				new LambdaArrayListExtraction_Info("b", 2),
				new LambdaArrayListExtraction_Info("b", 3),
				new LambdaArrayListExtraction_Info("c", 1),
				new LambdaArrayListExtraction_Info("c", 2));
		

		// Display List Extraction A
		System.out.println("01 - Display List Print A - Lambda Extraction - key");
		List<String> keys = 
				list.stream()
				.map(LambdaArrayListExtraction_Info::keyOut)
				.collect(Collectors.toList());
		keys.forEach(listItemKey -> {System.out.print(listItemKey + "\t");});
		System.out.println();System.out.println();

		// Display List Extraction B
		System.out.println("02 - Display List Print B - Lambda Extraction - value");
		List<Integer> values = 
				list.stream()
				.map(LambdaArrayListExtraction_Info::valueOut)
				.collect(Collectors.toList());
		values.forEach(listItemValue -> System.out.print(listItemValue + "\t"));
		System.out.println();System.out.println();
		

		// Display List Extraction C
		System.out.println("03 - Display List Print C - Lambda Extraction - customized");
		List<LambdaArrayListExtraction_Info> extractListItems = 
				list.stream()
				.filter(listItemValue -> {return listItemValue.keyOut().equals("b") && listItemValue.valueOut() <= 3;})
				.collect(Collectors.toList());
		extractListItems.forEach(LambdaArrayListExtraction_Info::display);
		
		
	}
}
