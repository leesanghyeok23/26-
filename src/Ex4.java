import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * distinct()메소드
		 * -스트림통로에서 중복된 요소를 제거합니다.
		 * 이는 equals()메소드를 기준으로 중복을 판단별하므로,
		 * 객체 경우 equals메소드를 적절히 구현해야 정확하게 중복이 제거됩니다.
		 * -내부동작
		 * 
		 * 
		 * */
		List<String> items = Arrays.asList("apple","banana","apple","orange");
		List<String> distinctitems= items.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctitems);
		
		

	}

}
