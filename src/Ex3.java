import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * filter(Prdeicate<T> predicate)추상 메소드
		 * - 스트림의 각 요소(객체)에 대해 주어진 조건을 평가하며,
		 *   Prdeicate함수형 인터페이스를 사용합니다
		 *   Prdeicate함수형 인터페이스를 사용합니다
		 *   Prdeicate함수형 인터페이스는 boolean값을 반환하는 test추상메소드를 가지고 있음으로써
		 * 	 이조건에 맞는 요소들만 다음 연산으로 넘깁니다.
		 * 
		 * - filter메소드는 여러번 체이닝 기법으로 호출할수 있어,
		 *   복잡한 조건을 단계적으로 나눠서 적용할수도 있습니다.
		 * 
		 * */
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
					//ArrayList고정크기 배열
					
					//IntegerStream입력스트림 통로 반호나
		List<Integer> newnumbers = numbers.stream()
		 			//스트림의 모든 요소에 대해 2보다 큰지 확인하고
			 		//조건을 만족하지 않는 요소들은 제외한 IntegerStream통로 반환하지않는
			 		.filter(n->n>2)
			 		
			 		//2의배수만 남기고 반환
			 		.filter(n->n%2==0)
			 		
//			 		collect(Collerctor<T,A,R> collector)
//			 		-메소드는 스트림의 결과를 리스트(list), 셋(set)또는 다른 컬렉션배열에 수집해서 반환해줍니다.
			 		.collect(Collectors.toList());
		
		System.out.println(newnumbers);
		
		
		/*
		 * 
		 * 2. 중간연산
		 * 		map(Function<T,R> mapper)메소드
		 * 		-	이메소드는 스트림의 각 객체(요소)를 변환할떄 사용됩니다.
		 * 			주어진 함수에 따라 각 요소를 변환하며, 다른형식으로 변환할수도 있습니다.
		 * 			Function<T,R>인터페이스는 입력타입과 반환타입이 다른 함수형 인터페이스 입니다.
		 * 
		 * 
		 * */
		
		List<String> nemes = Arrays.asList("Alice", "Bob", "Chrlie");
		
		//각 문자열의 길이를 계산해서 새로운 리스트로 반환
		List<Integer> newLengths = nemes.stream()
										.map(String::length)
										.collect(Collectors.toList());
		
		System.out.println(newLengths); //[5, 3, 6]

		
	}
	

}

