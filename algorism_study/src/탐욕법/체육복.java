package 탐욕법;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {

	public static void main(String[] args) {

		int[] lost = {2,4}; // 도난
		int[] reserve = {1,3,5}; // 여벌
		int n = 5; // 전체 학생수 (2명 이상 30명 이하)

		solution(n, lost, reserve);

	}

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = n;

		List<Integer> list = new ArrayList<Integer>();

		for(int i : lost){

			boolean pass = true;	// 패스값 설정
			boolean loan = false;

			System.out.println("i값" + i);

			for(int j : reserve){


				System.out.println("j값" + j);


				for(int k : list){
					System.out.println("K리스트" + k);

					 System.out.println("이때 j값은?" + j);

					if(k == j){

						System.out.println("포함");
						pass = false;
						break;
					}
				}

				if(pass){
					if(i == j-1) {
						list.add(j);
						loan = true;
						break;
					}else if(i == j + 1){
						list.add(j);
						loan = true;
						break;
					}
				}
			}

			if(loan == false){
				answer --;
			}

		}


		for(int i : list){
			System.out.println("최종k : " + i);
		}

		System.out.println(answer);

		return answer;






	}
	
	
}
