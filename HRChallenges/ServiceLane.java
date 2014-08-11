package test;

import java.util.Scanner;

public class ServiceLane {

	public static int findMin(int[] data, int startIndex, int endIndex) {
		int min = Integer.MAX_VALUE;
		for (int i = startIndex; i <= endIndex; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int T = input.nextInt();
		int[] laneSegments = new int[N];
		for (int i = 0; i < N; i++) {
			laneSegments[i] = input.nextInt();
		}

		for (int k = 0; k < T; k++) {
			int i = input.nextInt();
			int j = input.nextInt();
			System.out.println(findMin(laneSegments, i, j));
		}
		input.close();
	}

}