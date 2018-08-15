/*==================================================================================================
�� INFORMATION
  �� Data : 15.08.2018
  �� Mail : eun1310434@naver.com
  �� WebPage : https://eun1310434.github.io/
  �� Reference
     - Hello Java Programming
     
�� FUNCTION
  �� 
   
�� Study
  �� LambdaForLoop
   - 
==================================================================================================*/
package com.eun1310434.lambda;

public class LambdaForLoop {
	public static void basic_display(String[] _strList){
		for(int i  = 0; i < _strList.length ; i++){
			System.out.println(_strList[i]);
		}
	}
	
	public static void lambda_display(String[] _strList){
		for(String str:_strList){
			System.out.println(str);
		}
	}
	public static void main(String[] ar) {
		String[] strList = {"a","b","c","d","e"};
		
		System.out.println("<<Basic Display>>");
		basic_display(strList);
		System.out.println("");

		System.out.println("<<Lambda Display>>");
		lambda_display(strList);		
	}
}
