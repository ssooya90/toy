package 탐욕법;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {

	public static void main(String[] args) {

		int[] lost = {1,2}; // 도난
		int[] reserve = {1,3,5}; // 여벌
		int n = 3; // 전체 학생수 (2명 이상 30명 이하)

		solution(n, lost, reserve);

	}

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = n;

		List<Integer> list = new ArrayList<Integer>();

//		 여벌이 있으나 도난 당한 경우엔 빌려줄 수 없으므로 선처리
//		for(int i : lost){
//
//			for(int j : reserve){
//
//				if(i == j){
//					list.add(j);
//					break;
//				}
//			}
//		}



		for(int i : lost){

			boolean loan = false; // 빌림 유무


			for(int j : reserve){

				boolean pass = true;  // 패스값 설정

				for(int k : list){

					if(k == j){

						System.out.println("있는 빌려준 적이 있음" +  j);
						pass = false;
						break;
					}
				}

				if(pass){
					if(i == j - 1) {
						list.add(j);
						loan = true;
						break;
					}else if(i == j + 1){
						list.add(j);
						loan = true;
						break;
					}else if(i == j){
						list.add(j);
						loan = true;
						break;
					}
				}
			}

			// 결국 못 빌렸다면 수업을 들 수 있는 학생 -1
			if(loan == false){
				System.out.println("앤써 깍아?");
				answer --;
			}

		}

		for(int i : list){
			System.out.println("최종k : " + i);
		}

		System.out.println(answer);

		return answer;


//



	}


}
