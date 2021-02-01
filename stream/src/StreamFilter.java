import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
	타입형 스트림
 */


// 스트림 널제거 필터링

public class StreamFilter {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("철수", "훈이", null, "유리", null);
		List<String> filteredList = stream.filter(Objects::nonNull)
				.collect(Collectors.toList());

		// 아예 x들을 빼버리고 아래와 같이 작성할 수 있다.
		stream.forEach(System.out::println);

	}


}
