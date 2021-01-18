


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
	타입형 스트림
 */


public class StreamBasic2 {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		// 1 ~ 9를 담는다
//		IntStream intStream = IntStream.range(0,10);

//		intStream.forEach(System.out::println);


		Stream<Long> stream1 = LongStream.rangeClosed(1, 5).boxed();

		Stream<Integer> stream2 = IntStream.rangeClosed(1, 5).boxed();

		stream1.forEach(System.out::println);
		stream2.forEach(System.out::println);

	}


}
