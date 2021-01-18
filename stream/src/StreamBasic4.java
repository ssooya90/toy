


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*
	타입형 스트림
 */


public class StreamBasic4 {

	public static void main(String[] args) {


		List<String> strList = Arrays.asList("a1", "a2", "a3", "a4", "a5", "c1", "c2");


		strList = strList.stream().filter(s -> s.startsWith("c"))
				.collect(toList());


		System.out.println(strList);


	}

}
