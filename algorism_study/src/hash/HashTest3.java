package hash;

import java.util.HashMap;

public class HashTest3 {




	public static void main(String[] args) {

		String[][] phone_book = {{"동그란 안경","검정 선글라스"},{"파란색 티셔츠"},{"청바지"},{"긴 코트"}};

		solution(phone_book);

	}


	public static int solution(String[][] phone_book) {

		int answer = 0;
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(phone_book);

		for(String name[] : phone_book){
			System.out.println(name);

			for(String name2 : name){
				System.out.println(name2);
			}
		}

		return answer;
	}

}
