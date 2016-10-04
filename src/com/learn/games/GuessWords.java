/**
 * 
 */
package com.learn.games;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author moling
 */
public class GuessWords {

	public String[] word;
	public Set<String> guessedLetters = new HashSet<String>();

	public GuessWords(String[] words) {
		word = words[new Random().nextInt(words.length)].split("");
	}

	private void printHiddleWord() {
		for (int i = 0; i < word.length; i++) {
			if (guessedLetters.contains(word[i])) {
				System.out.print(word[i]);
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}

	private boolean isWin() {
		return false;
	}

	public static void main(String[] args) {

		GuessWords gw = new GuessWords(new String[] { "hello", "world", "guess", "words", "string" });
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.printf("电脑已随机生成一个长度为%d的单词。", gw.word.length);
		gw.printHiddleWord();

		while (true) {
			System.out.println("你已经猜过的字母：" + gw.guessedLetters);
			System.out.print("请输入你猜的字母：");
			String string = (String) input.next();
			if ("exit".equals(string)) {
				break;
			}

			gw.guessedLetters.add(string);
			gw.printHiddleWord();
		}
	}
}
