package com.dxc.log4j;

import java.util.Scanner;
import java.util.logging.Logger;

public class Demo_01 {

	static Logger log = Logger.getLogger("Demo_01.class");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range");
		int range = sc.nextInt();
		for (int c = 0; c < range; c++) {
			System.out.println(c);
			if (c % 3 == 0) {
				System.out.println("multiple of 3 :" + c);
			}

		}
	}
}
