public class Functional {


	public static void main(String[] args) {

		// AS-IS
		SimpleInterface functionalInterface01 = new SimpleInterface() {
			@Override
			public void action() {
				System.out.println("익명 클래스");
			}
		};

		functionalInterface01.action();

		// TO-BE

		SimpleInterface functionalInterface02 = () -> System.out.println("람다식");

		functionalInterface02.action();
	}


}
