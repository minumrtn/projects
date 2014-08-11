package test;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.replaceAll("\\s+", "");

		int w = (int) Math.ceil(Math.sqrt(input.length()));
		int h = (int) Math.floor(Math.sqrt(input.length()));

		int h1 = 0, w1 = 0;
		if (input.length() / h >= w)
			h += 1;

		String result = "";

		char[][] encrypt = null;
		int adjust = Math.abs(w - h);
		if (h > w) {
			encrypt = new char[h][w + adjust];
			w1 = w + adjust;
			h1 = h;
		} else if (w > h) {

			encrypt = new char[h + adjust][w];
			h1 = h + adjust;
			w1 = w;
		} else {
			encrypt = new char[h][w];
			h1 = h;
			w1 = w;

		}
		int index = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (index + 1 <= input.length()) {
					encrypt[i][j] = input.charAt(index);
					index++;
				}
			}
		}
		for (int i = 0; i < h1; i++) {
			for (int j = 0; j < w1; j++) {
				if ((encrypt[j][i] != '\0'))
					result += Character.toString(encrypt[j][i]);
			}
			result += " ";
		}

		System.out.println(result);
		scanner.close();
	}

}