


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

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
						i2 -> car.get(index.incrementAndGet()).toString(),        // value
						(existingValue, newValue) -> existingValue)
				);


		System.out.println("TEST");


	}


}
