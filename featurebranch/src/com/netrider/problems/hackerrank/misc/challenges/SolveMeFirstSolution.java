/**
 * https://www.hackerrank.com/challenges/solve-me-first/problem
 */
package com.netrider.problems.hackerrank.misc.challenges;

import java.util.Scanner;

/**
 * @author netrider2008
 *
 */
public class SolveMeFirstSolution {

	static int solveMeFirst(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
