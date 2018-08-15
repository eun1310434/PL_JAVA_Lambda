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
  ¡Û Lambda Expression
    - (dataformat parameter, ... ) - > { implementation; }
    - class name::static method
    - class name::class method
    - object name::member method
    - class name::new 
  ¡Û Lambda ArrayList
   - 
==================================================================================================*/
package com.eun1310434.lambda;
import java.util.Arrays;
import java.util.List;

class LambdaArrayListPrint_Info {
	private String key;
	private int value;
	public LambdaArrayListPrint_Info(String _key, int _value){
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

public class LambdaArrayListPrint {
	public static void main(String[] ar) {
		
		//Declare List : Efficient coding
		List<LambdaArrayListPrint_Info> list = Arrays.asList(
				new LambdaArrayListPrint_Info("a", 5),
				new LambdaArrayListPrint_Info("b", 4),
				new LambdaArrayListPrint_Info("c", 3),
				new LambdaArrayListPrint_Info("d", 2),
				new LambdaArrayListPrint_Info("e", 1));
		
		//Display List Print A
		System.out.println("01 - Display List Print A - Lambda -> ");
		list.stream().forEach(listItem -> {
			System.out.println(listItem.keyOut() + "," + listItem.valueOut());
		});
		//(dataformat parameter, ... ) -> { implementation; }
		System.out.println();
		
		//Display List Print B
		System.out.println("02 - Display List Print B - Lambda -> ");
		list.stream().forEach(listItem -> listItem.display());
		//(dataformat parameter, ... ) -> { implementation; }
		System.out.println();

		//Display List Print C
		System.out.println("03 - Display List Print C - Lambda :: ");
		list.stream().forEach(LambdaArrayListPrint_Info::display);
		//class name::class method
		System.out.println();
		
	}
}
