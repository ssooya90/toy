


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
	타입형 스트림
 */


public class StreamBasic3 {

	public static void main(String[] args) {


		List<String> strList = Arrays.asList("a1", "a2", "a3", "a4", "a5", "c1", "c2");


		strList.stream().filter(s -> s.startsWith("c"))
				.forEach(System.out::println);


	}

}
