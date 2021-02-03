import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
	부분 배열
 */


public class Person {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {


		List<Person> personList = Arrays.asList(
				new Person("Kimtaeng", 30),
				new Person("Madplay", 29));

		List peekList = personList.stream()
				.peek(m -> m.setAge(77))
				.collect(Collectors.toList());

		List mapList = personList.stream()
				.map(m -> m.getAge() + 1)
				.collect(Collectors.toList());

		System.out.println(1);

		// 결과 [("Kimtaeng,77),("Madplay",77)]

		// 결과 : [31,30]


//		personList.stream()
//				.peek(m -> m.setAge(77))
//				.forEach(System.out::println);

//		System.out.println(names);

//		 Kimtaeng, Madplay 출력
//		names.forEach(System.out::println);


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
