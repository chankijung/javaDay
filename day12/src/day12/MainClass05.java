package day12;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("이름입력:");
		name = input.next();
		System.out.println("나이입력:");
		age = input.nextInt();
		
		Ex05 ex = new Ex05();
		ex.setName(name);
		ex.setAge(age);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
	}

}
