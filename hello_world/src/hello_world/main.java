package hello_world;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		execute();
		
	}

	public static void execute() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		String message = myObj.nextLine();
		char[] hello = new char[message.length()];
		char[] helloReverse = new char[message.length()];
		String reassemble = "";
		
		int k = message.length();
		
		for(int i = 0; i < k; i++) {
			hello[i] = message.charAt(i);
		}
		
		for(int j = 0; j < k; j++) {
			helloReverse[j] = message.charAt(k - j - 1);
		}
		
		for(int l = 0; l < k; l++) {
			reassemble = reassemble + helloReverse[l];
		}
		
		System.out.println(Arrays.toString(hello));
		System.out.println(Arrays.toString(helloReverse));
		System.out.println(reassemble);
		
		execute();
	}
	
}
