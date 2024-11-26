package _241126_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Q {
	// q1. 사용자에게 정수를 연속으로 입력받기(음수를 받으면 종료)
	// 각 정수가 몇 번씩 입력받았는지 출력하는 프로그램
	
	// 입력예) 10 30 30 20 40 10
	// 출력예)	10:2
	//      	20:1
	//			30:2
	//			40:1
	private List<Integer> list = new ArrayList<>();
	private final static Scanner SCANNER = new Scanner(System.in);
	
	public List<Integer> getList() {
		return list;
	}
	
	public void input() {
		boolean flag = true;
		while (flag) {
			int input = SCANNER.nextInt();
			SCANNER.nextLine();
			if (input >= 0) {
				list.add(input);
			} else {
				flag = false;
			}
		}
	}
	
	public void printNums() {
		TreeSet<Integer> nums = new TreeSet<>(list);
		for (Integer elements : nums) {
			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				if (elements == list.get(i)) {
					count++;
				}
			}
			System.out.println(elements + " : " + count);
		}
	}
}
