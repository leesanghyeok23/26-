
//함수형 인터페이스? 추상메소드를 단 하나만 가진 인터페이스
//				람다식을 작성할때 사용되는 인터페이스

//@FunctionalInterface 어노테이션 기호
//->이 인터페이스가 함수형 인터페이스임을 자바컴파일러에게 알려주는 기호임


@FunctionalInterface
interface MathOperation{
	//operation이름의 추상메소드를 정의함
	//기능: 두개의 정수를 매개변수로 각각 받아 int타입으로 값을 반환하는 메소드
	int operation(int a, int b);
	
	
}


public class Main {

	public static void main(String[] args) {
		
//		람다식은 본질적으로 함수형 부모인터페이스의 자식 익명객체의 메소드를 구현하는 방식이며
//		이 과정은 자바 컴파일러에 의해서 자동으로 처리
//
//		1.익명클래스의 예시 : 익명클래스는 새로운 클래스에 이름을 정의하지 않고,
//						 바로 부모인터페이스나 부모클래스를 구현하는 객체를 생성하는 설계도입니다.

		
//		MathOperation add = new MathOperation() {
//			
//			// 메소드 강제 오버라이딩
//			@Override
//			public int operation(int a, int b) {
//				return a+b;
//				
//			}
//		};
//		System.out.println(add.operation(5, 3));
		
		/*
		 *
		 * 2.람다식의 예시 : 익명클래스 대신 람다식을 사용하면 코드가 훨씬 간결해 집니다.
		 * 
		 */
			MathOperation add = (int a, int b)->{return a+b;};
								//=(a,b)->a+b;
			System.out.println(add.operation(3, 5));
					
			MathOperation subtract = (int a, int b)->{return a-b;};
			System.out.println(subtract.operation(5, 3));
			
			
	}

}
