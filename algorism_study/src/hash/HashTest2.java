package hash;

import java.util.HashMap;

public class HashTest2 {




	public static void main(String[] args) {

		String[] phone_book = {"123" ,"456", "789" , "1234"};

		solution(phone_book);

	}


	public static boolean solution(String[] phone_book) {

		boolean answer = true;

		for(int i = 0 ; phone_book.length > i ; i++){

			String _this = phone_book[i];

			for(int j = i+1 ; phone_book.length > j ; j++){

				if(phone_book[j].startsWith(_this)){
					answer = false;
					break;
				}

				if(answer == false){
					break;
				}

//
			}

		}

		return answer;
	}

}
