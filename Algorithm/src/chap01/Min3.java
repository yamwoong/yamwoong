package chap01;

import java.util.Scanner;

class Min3{
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("�� ������ �ּҰ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		c = stdIn.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("�ּҰ���" + min + "�Դϴ�.");
	}
}