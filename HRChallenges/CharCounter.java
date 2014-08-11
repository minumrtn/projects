package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CharCounter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfentries = s.nextInt();
		List<String> elements = new ArrayList<String>();
		for (int i = 0; i < noOfentries; i++) {
			elements.add(s.next());
		}
		char ch;
		Set<String> res = new HashSet<String>();
		for (String el : elements) {
			for (int i = 0; i < el.length(); i++) {
				ch = el.charAt(i);
				if (isPresent(ch, elements)) {
					res.add(String.valueOf(ch));
				}
			}
		}
		System.out.println(res.size());
	}

	private static boolean isPresent(char ch, List<String> elements) {

		for (String el : elements) {
			if (el.indexOf(ch) == -1)
				return false;
		}
		return true;

	}

}