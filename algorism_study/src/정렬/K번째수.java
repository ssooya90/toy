package 정렬;

import java.util.*;

public class K번째수 {

	public static void main(String[] args) {

		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

		solution(array, commands);

	}



	public static int[] solution(int[] array, int[][] commands) {

		// answer의 길이를 commands 길이만큼 생성
		int[] answer = new int[commands.length];


		// commands for문 실행
		for(int i=0 ; commands.length-1 >= i ; i++){

			// 숫자를 담을 list 생성
			List<Integer> list = new ArrayList();

			// 제공된 arrays를 길이만큼 for문 실행
			for(int j=0 ; array.length > j ; j++){

				// commands 첫번째 값과 arrays 자리 수 확인 로직
				// j는 arrays의 자릿수이며
				if(commands[i][0]-1 <= j){

					// 자릿수가 commands 첫번째 자리수 이상이며, commands 두번째 자릿수 이하인 것을 list로 담음
					if(commands[i][1]-1 >= j){
						list.add(array[j]);
					}
				}
			}

			// list 오름차순
			list.sort(null);

			// list.sort(null)은 list.sort(Comparator.naturalOrder())와 같은 기능이라고 javadoc에서 표시하고 있음
			// list.sort(Comparator.reverseOrder())은 내림차순임

			// commands 첫번째 자릿수와 두번째 자릿수를 이용하여 숫자를 추출한 뒤, 세번째 자릿수에 맞는 숫자를 가지고 와서 answer에 담음
			answer[i] = list.get(commands[i][2]-1);
		}


		return answer;

	}
	
	
}
