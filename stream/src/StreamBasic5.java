import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
	부분 배열
 */


public class StreamBasic5 {


	public static void main(String[] args) {


		String[] arr = new String[]{"A", "B"};
		List<String> arr2 = Arrays.asList("G", "F");

		Stream.concat(Arrays.stream(arr), arr2.stream()).forEach(System.out::println);


	}

}
