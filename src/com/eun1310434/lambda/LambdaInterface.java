/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍, https://programmers.co.kr
*/
package com.eun1310434.lambda;

interface LambdaInterface_I{
    public int method(int value1, int value2);
}

public class LambdaInterface {   
	
    public static void exec(int a, int b, LambdaInterface_I I){
        int k = 10;
        int m = 20;
        int value = I.method(k, m);
        System.out.println(value);
    }
    
    public static void main(String[] args) {    
    	/*
    	exec(10,5,new LambdaInterface_I() {
			@Override
			public int method(int i, int j) {
				// TODO Auto-generated method stub
				return i - j;
			}
		});
    	*/
    	
    	//자바는 메소드만 인자로 전달하려면 반드시 객체를 만들어야 함.
    	//Java8 람다식 -> 함수만 전달하는 것처럼 간편하게 문법을 사용 가능
        exec(10,5,(i, j)->{
            return i - j;
        }); }

}
