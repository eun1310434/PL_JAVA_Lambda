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

class LambdaArrayListFilter_Info {
	private String key;
	private int value;
	public LambdaArrayListFilter_Info(String _key, int _value){
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

public class LambdaArrayListFilter {
	public static void main(String[] ar) {
		
		//Declare List : Efficient coding
		List<LambdaArrayListFilter_Info> list = Arrays.asList(
				new LambdaArrayListFilter_Info("a", 1),
				new LambdaArrayListFilter_Info("a", 2),
				new LambdaArrayListFilter_Info("a", 3),
				new LambdaArrayListFilter_Info("b", 1),
				new LambdaArrayListFilter_Info("b", 2),
				new LambdaArrayListFilter_Info("b", 3),
				new LambdaArrayListFilter_Info("c", 1),
				new LambdaArrayListFilter_Info("c", 2));
		
		
		// Display List Filter A
		System.out.println("01 - Display List Print A - Lambda filter ");
		list.stream()
		.filter(p -> {
			return p.valueOut() >= 3 && p.valueOut() <= 5;
		}).forEach(LambdaArrayListFilter_Info::display);
		System.out.println();

		// Display List Filter B
		System.out.println("02 - Display List Print B - Lambda filter ");
		list.stream()
		.filter(p -> p.valueOut() >= 3 && p.valueOut() <= 5)
		.forEach(LambdaArrayListFilter_Info::display);
		System.out.println();		
	}
}


