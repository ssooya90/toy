package hash;

import java.util.HashMap;

public class HashTest1 {


	public static void main(String[] args) {

		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] competition = {"stanko", "ana", "mislav"};
		solution(participant, competition);

	}


	public static String solution(String[] participant, String[] completion) {

		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();


		for (String name : participant) {

			map.put(name, map.getOrDefault(name, 0) + 1);

			System.out.println(map);
		}

		for (String name : completion) {

			map.put(name, map.getOrDefault(name, 0) - 1);

			System.out.println(map);
		}

		for (String key : map.keySet()) {

			if (map.get(key) != 0) {
				answer = key;
			}
		}


		System.out.println(answer);
		return answer;
	}

}
