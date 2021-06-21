package 완전탐색;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {

	public static void main(String[] args) {

		int[] array = {1, 3, 2, 4, 2}; // 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
		solution(array);

	}


	public static int[] solution(int[] answers) {

		int[] man1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
		int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

		int man1Score = 0, man2Score = 0, man3Score = 0;

		for(int i = 0 ; answers.length > i ; i++){

			if(answers[i] == man1[i]){
				man1Score ++;
			}

			if(answers[i] == man2[i]){
				man2Score ++;
			}

			if(answers[i] == man3[i]){
				man3Score ++;
			}
		}


		// man1,2,3 숫자중 가장 높은 숫자를 선정 후, 동점자 있을 경우 오름차순


//
//		for(int num : answers){
//
//			System.out.println(num);
//
//
//		}



//		for(int num : answers){
//
//			if(man1[cnt] == num){
//				man1Score ++;
//			}
//
//			if(man2[cnt] == num){
//				man2Score ++;
//			}
//
//			if(man3[cnt] == num){
//				man3Score ++;
//			}
//
//		}
//
		int[] answer = {};


		return answer;


	}


}
