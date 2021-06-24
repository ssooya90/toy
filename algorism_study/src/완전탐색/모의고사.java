package 완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

	public static void main(String[] args) {

		int[] array = {2,1,2,3,2,1,2,3,4,5,2,3,4,1,2,3,1,2,3,1,2,3}; // 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
		solution(array);

	}


	public static int[] solution(int[] answers) {

		int[] man1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		int[] man2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
		int[] man3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

		int[] score = {0,0,0};
		int[] manMaxScore = new int[score.length];

		
		// man의 시험 결과만큼 array가 돌아야함
		
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

		// 내리참순을 통해 가장 높은 값이 무엇인지 정렬
		Arrays.sort(manMaxScore);
		int max = manMaxScore[manMaxScore.length-1];

		int sameNum = 0;


		/***
		 * // 동점자 인원을 구해야 함
		 */

		for(int i = 0 ; score.length > i ; i++){

			System.out.println("스코어" + score[i]);

			if(score[i] == max){
				sameNum ++;
			}

		}

		int[] answer = new int[sameNum];

		System.out.println("동점값 " +  sameNum);
		System.out.println("스코어 랭쓰" + score.length);

		int same = 0;

		for(int i = 0 ; score.length > i ; i++){

			System.out.println("스코어 값" + score[i]);

			if(score[i] == max){
				answer[same++] = i+1;
			}
		}

		for(int num : answer){
			System.out.println(num);
		}

		return answer;


	}


}
