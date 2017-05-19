package test.main;

import test.mypac.MyBox;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		MyBox<String> box1 = new MyBox<String>();
		
		// 기본 data type 으로 Generic 클래스를 지정 불가
		//MyBox<int> box2 = new MyBox<int>();
		
		// 기본 data type 의 클래스 type 을 wrapper 클래스라고 한다.
		
		Byte a = 10; // byte 의 객체형
		Short b = 10; // short 의 객체형
		Integer c = 10; // int 의 객체형
		Long d = 10l; // long 의 객체형
		
		Float e = 10.1f; // float 의 객체형
		Double f = 10.1d; // double 의 객체형
		
		Character g = 'A'; // char 의 객체형
		Boolean h = true; // boolean 의 객체형
		
		//int i = 10;
		//i. // i는 객체형이 아니라 점 찍어도 아무 반응 없음
		
		// 기본 데이터 type 의 객체형을 이용해서 Generic Class 지정하기
		MyBox<Integer> box2 = new MyBox<Integer>();
		box2.set(10); // integer 이라 해서 id 값으로 전달 안해도 됌.
		int result = box2.get();
		//Integer result = box2.get(); //이렇게 써도 됨
		
		// 객체 생성시 Generic type 생략가능
		MyBox<Boolean> box3 = new MyBox<>(); // <>안에 지워도 됌.(==Generic type 생략가능)
		box3.set(true);
		//boolean result2 = box3.get(); // 이렇게 써도 됌
		Boolean result2 = box3.get(); 
	}
}
