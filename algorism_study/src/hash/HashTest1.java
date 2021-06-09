package hash;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTest1 {


	public static void main(String[] args) {

		String[] participant={"mislav", "stanko", "mislav", "ana"};
		String[] competition={"stanko", "ana", "mislav"};


		String test = "!";

		solution(participant, competition);

	}


	public static String solution(String[] participant, String[] completion) {

		String answer = "";
		ArrayList<String> completionList  = new ArrayList<>(Arrays.asList(completion));
		ArrayList<String> participantList  = new ArrayList<>(Arrays.asList(participant));
		ArrayList<String> resultList  = new ArrayList<>(Arrays.asList(participant));



		System.out.println(participantList);




		for(String name : participantList){

			System.out.println(completionList.indexOf(name));
			System.out.println(name);

			resultList.remove(completionList.indexOf(name));
			System.out.println(resultList);

//			participantList.remove(1);

//			System.out.println(completionList.indexOf(name));
//			System.out.println(name);
//
//			if(completionList.lastIndexOf(name) == -1){
//				answer = name;
//			}

		}

		System.out.println(resultList);
		System.out.println(answer);
		return answer;
	}

}
