


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	스트림 기본
	List로 스트림 생성
 */


public class StreamBasic1 {

	public static void main(String[] args) {

		/**
		 * ArrayList나 List 전부 스트림으로 사용할 수 있다.
		 */

		List<String> arrayList = new ArrayList<>();
		arrayList.add("arrayList");

		List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");

		Stream<String> stream1 = arrayList.stream();
		Stream<String> stream2 = list.stream();


		stream1.forEach(System.out::println);
		stream2.forEach(System.out::println);

	}


}
