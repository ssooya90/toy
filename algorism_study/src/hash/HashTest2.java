package hash;

import java.util.HashMap;

public class HashTest2 {


	public static void main(String[] args) {

		String[] phone_book = {"123" ,"119", "97674223", "1195524421"};

		solution(phone_book);

	}


	public static String solution(String[] phone_book) {

		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();


		int i = 0;
		for(String phone : phone_book){
			map.put(phone, i++);
//
//			System.out.println(phone.startsWith(phone));

		}

		for(String value : map.keySet()){
			value.startsWith("");
		}



		System.out.println(map);


		System.out.println(map.containsValue(12));

		// 접두사 확인을 어떻게 해야하지..?




		return answer;
	}

}
