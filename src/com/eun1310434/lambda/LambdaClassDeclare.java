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
  ¡Û LambdaClassDeclare
    - 
==================================================================================================*/
package com.eun1310434.lambda;
import java.util.function.Supplier;

interface LambdaClassDeclare_I{
	public void set(String key);
	public void print();
}

class LambdaClassDeclare_a implements LambdaClassDeclare_I{
	private String name;
	
	@Override
	public void set(String _name) {
		this.name = _name;
	}
	
	@Override
	public void print() {
		System.out.println("A_Name : "+name);
	}
}

class LambdaClassDeclare_b implements LambdaClassDeclare_I{
	private String name;
	
	@Override
	public void set(String _name) {
		this.name = _name;
	}
	
	@Override
	public void print() {
		System.out.println("B_Name : "+name);
	}
	
	public void printB() {
		System.out.println("B_Name : "+name);
	}
}

class LambdaClassDeclare_Reference {
	public static <T extends LambdaClassDeclare_I> T get(String str, Supplier<T> factory) {
		T obj = factory.get();
		obj.set(str);
		return obj;
	}
}

public class LambdaClassDeclare {
	public static void main(String[] ar) {
		LambdaClassDeclare_I i1 = LambdaClassDeclare_Reference.get("Class-A", LambdaClassDeclare_a::new);
		LambdaClassDeclare_I i2 = LambdaClassDeclare_Reference.get("Class-B", LambdaClassDeclare_b::new);
		i1.print();
		i2.print();
	}
}
