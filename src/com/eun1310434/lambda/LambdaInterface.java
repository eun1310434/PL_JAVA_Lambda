/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���, https://programmers.co.kr
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
    	
    	//�ڹٴ� �޼ҵ常 ���ڷ� �����Ϸ��� �ݵ�� ��ü�� ������ ��.
    	//Java8 ���ٽ� -> �Լ��� �����ϴ� ��ó�� �����ϰ� ������ ��� ����
        exec(10,5,(i, j)->{
            return i - j;
        }); }

}
