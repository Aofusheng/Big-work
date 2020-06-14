package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Scanner in = new Scanner(System.in);
		Sense game = new Sense();
		game.printWelcome();


		Sense sense = new Sense();
		sense.initSense();
		sense.play();

	}
}

