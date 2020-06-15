package com.ssooya;


public class MakeLotto {

	public static void main(String[] args) {

		int Lotto[] = new int[6];


		for(int i = 0 ; i < Lotto.length ; i ++){
			Lotto[i] = (int)(Math.random()*45)+1;
			System.out.println(Lotto[i]);
		}



	}



}
