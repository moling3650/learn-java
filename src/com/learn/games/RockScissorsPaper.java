package com.learn.games;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
	public String[] options = { "石头", "剪刀", "布" };

	/**
	 * 打印出所有选项
	 */
	public void printOptions() {
		System.out.println("您可以选择：");
		for (int i = 0; i < options.length; i++) {
			System.out.printf("%d： %s\n", i, options[i]);
		}
	}

	/**
	 * @return 电脑随机选择了一个
	 */
	public int computerOption() {
		int option = new Random().nextInt(options.length);
		System.out.println("电脑选择了" + options[option]);
		return option;
	}

	/**
	 * 对比胜负
	 * 
	 * @param option
	 *            玩家的选择
	 * @param cupOption
	 *            电脑的选择
	 */
	public void compare(int option, int cupOption) {
		int result = (option - cupOption + options.length) % options.length;

		switch (result) {
		case 0:
			System.out.println("居然平局了");
			break;
		case 1:
			System.out.println("被机器打败了...");
			break;
		case 2:
			System.out.println("战胜了机器人！");
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RockScissorsPaper rsp = new RockScissorsPaper();
		System.out.println("游戏开始了！");
		rsp.printOptions();
		int option = scanner.nextInt();
		System.out.println("你选择了" + rsp.options[option]);
		int cupOption = rsp.computerOption();
		rsp.compare(option, cupOption);
		scanner.close();
	}

}
