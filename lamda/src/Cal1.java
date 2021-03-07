public class Cal1 {


	public static void main(String[] args) {


		// 기본형
		Calculator calculator = (int num1, int num2) -> {return num1 + num2;};

		// 자료형 생략
		Calculator calculator2 = (num1, num2) -> {return num1 + num2;};

		// 중괄호 생략
		Calculator calculator3 = (int num1, int num2) -> num1 + num2;

		// 매개변수가 하나일 경우 소괄호 중괄호 생략
		Calculator2 calculator4 = num1 -> System.out.println(num1);






		System.out.println(calculator.cal(1,2));



	}

}
