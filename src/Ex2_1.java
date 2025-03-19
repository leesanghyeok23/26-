import java.util.Arrays;
import java.util.List;

public class Ex2_1 {

	public static void main(String[] args) {
		//Arrays.asList()메소드는 제공된 배열의 요소들을 포함하는 고정 크기의 ArrayList배열을 생성해서 반환해줌
		//반환된 ArrayList는 인스턴스이지만, 고정 크기의 리스트로 다룰수 있으며,
		//요소(객체)의 추가나 삭제는 허용되지 않습니다.
		List<Integer> scores = Arrays.asList(65, 70, 80, 90, 85, 50, 40);
		//{65, 70, 80, 90, 85, 50, 40} <- 모두 Integer객체들이 오토박싱에 의해 저장된 고정크기의 배열
		// 0    1   2   3   4   5  6   index
		
		//----- 60점 이상의 성적만 필터링(걸래내고)하고  평균을 계산하려고 한다
		double average = scores.stream()  //IntegerStream입력스트림 반환
							   .filter(score -> score >= 60) //60점 이상 필터링 한 IntegerStream입력스트림 반환
						       .mapToInt(score -> score) //IntegerStream을 IntStream으로 변환
						       .average() //78.0 평균을 계산해서 담은 OptionalDouble를 반환하는데
						       .orElse(0.0);//IntStream통로에 점수들이 없으면 0.0로 설정해 0.0을 반환합니다
		
		System.out.println("Average Score : " + average);
		 //Average Score :       78.0

	}

}








