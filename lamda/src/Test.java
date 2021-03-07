public class Test {


	public static void main(String[] args) {


		Say say = (num1, num2) -> {return num1 + num2;};

		Person person = new Person();

		person.hi((a,b) -> {
			System.out.println("hi");
			return a*b;
		});



	}

}
