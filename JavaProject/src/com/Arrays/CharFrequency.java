package com.Arrays;

public class CharFrequency {

	public static void findCount(char[] ch) {

		for (int i = 0; i < ch.length; i++) {
			boolean visited = false;
			int flag = 1;

			for (int j = i - 1; j >= 0; j--) {
				if (ch[i] == ch[j]) {
					visited = true;
					break;
				}
			}

			if (visited == false) {
				for (int k = i + 1; k < ch.length; k++) {
					if (ch[i] == ch[k]) {
						flag++;
					}
				}
				System.out.println("Charector is :" + ch[i] + "--->" + "Charector count is :" + flag);
			}
		}

	}

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'a', 'd', 'b', 'b', 'c', 'e' };

		CharFrequency.findCount(ch);
	}
}
