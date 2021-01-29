


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/*
	타입형 스트림
 */


// List to Map

public class StreamMap1 {

	public static void main(String[] args) {

		AtomicInteger index = new AtomicInteger(0);
		List<Integer> car = Arrays.asList(1, 2, 3);
		Map<Integer, String> map = car.stream()
				.collect(Collectors.toMap(
						i1 -> car.get(index.get()),        // key
						i2 -> car.get(index.getAndIncrement()).toString(),        // value
						(existingValue, newValue) -> existingValue)    // 중복키가 발생할 경우 처리 방법
				);


		List<String> names = Arrays.asList("java 8", "teSt");
		List<?> namesStream = names.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());


		System.out.println(names);


	}


}
