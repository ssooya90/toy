import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
	타입형 스트림
 */


// flatMap()

public class StreamMap2 {

	public static void main(String[] args) {

		List<String> programing = Arrays.asList("Javascript", "C", "C++", "Nodejs", "Java", "Oracle", "MariaDB", "PHP", "ASP");


		List list = programing.stream()
				.filter(str -> (str.startsWith("C")))
				.collect(Collectors.toList());


		System.out.println(list);

	}


}
