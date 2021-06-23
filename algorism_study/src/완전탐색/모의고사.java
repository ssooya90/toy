package 완전탐색;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5}; // 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
		solution(array);

	}


	public static int[] solution(int[] answers) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int[] man1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
		int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

		int[] score = {0,0,0};

		int manMaxScore[] = new int[3];
		int[] answer = new int[3];


		System.out.println("!");
		for(int i = 0 ; answers.length > i ; i++){

			if(answers[i] == man1[i]){
				score[0]++;
				manMaxScore[0] ++;
			}

			if(answers[i] == man2[i]){
				score[1]++;
				manMaxScore[1] ++;
			}

			if(answers[i] == man3[i]){
				score[2]++;
				manMaxScore[2] ++;
			}
		}

		// man1,2,3 숫자중 가장 높은 숫자를 선정 후, 동점자 있을 경우 오름차순

		// 최대값
//		(manMaxScore);
		Arrays.sort(manMaxScore);

		int max = manMaxScore[manMaxScore.length-1];
		System.out.println(max);

//		manScore[0];
		for(int i = 0 ; score.length > i ; i++){

			if(score[i] == max){
				answer[i] = i+1;
			}

		}

		return answer;


	}


}
