package scanner;

import java.util.Scanner;

public class Sc3 {
	public static void main(String[] args) {
		
		// 자기 소개 하기
		System.out.println("이름과 나이, 키, 몸무게, 재산을 입력해주세요.>> ");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		float height = sc.nextFloat();
		double weight = sc.nextDouble();
		int money = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name 
				+ ", 나이는 " + age 
				+ "살, 키는 " + height 
				+ "cm, 몸무게는 " + weight
				+ "kg, 재산은 " + money +"원 입니다.");
		
	}

}
