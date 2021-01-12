


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	스트림 필터 기본
	Filter 기능 테스트
 */


public class StreamFilter1 {

	public static void main(String[] args) {

		// stream는 arrays.asList을 사용한다.

		List<String> test = new ArrayList<>();
		test.add("test");


		List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
		Stream<String> stream1 = list.stream();
		Stream<String> filtered = stream1.filter(s -> s.startsWith("c"));
		filtered.forEach(System.out::println);


	}


}
