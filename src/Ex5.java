import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
//람다식, Stream API활용
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
						   //[1, 2, 3, 4, 5, 6] <-- Integer객체들이 저장된 고정크기 배열
	
//스트림 통로 종류 크게   일반스트림(InputStream,OutputStream) 과
//                  데이터스트림(컬렉션 배열에 저장된 객체가 흘러가는 통로) 로 나뉜다		
		
				  //IntegerStream 데이터스트림 통로 객체
				  //numbers.stream();
				  /*
					<------   IntegerStream 데이터스트림 통로 
						--------------------------------
						
								1, 2, 3, 4, 5, 6
						
						--------------------------------
				*/
				  
			//	  numbers.stream()
			//	         .filter( (n) -> { return  n % 2 == 0;  } ); //중간연산
				     /*
				     	<------   IntegerStream 데이터스트림 통로 
				     		--------------------------------
				     		
				     				 2,  4,  6
				     		
				     		--------------------------------
				     */	
	
List<Integer> eventNumbers	=	  numbers.stream()
								  		 .filter( (n) -> { return  n % 2 == 0;  } )
								  		 .collect(Collectors.toList()); //최종연산 후 결과데이터 산출
				  
System.out.println(eventNumbers.toString());//"[2, 4, 6]"
				  
	
	
				  
	}

}









