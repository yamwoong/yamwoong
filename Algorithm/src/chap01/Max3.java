package chap01;
import java.util.Scanner;


class Max3{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : "); int a = stdIn.nextInt();
		System.out.print("b�� �� : "); int b = stdIn.nextInt();
		System.out.print("c�� �� : "); int c = stdIn.nextInt();
		int max = a;
		if(b > max) max = b;
		if(c > max)	max = c;
		
		System.out.println("�ִ��� " + max + "�Դϴ�");
	}
}

/* 		int max = a;
		if(b > max) max = b;
		if(c > max)	max = c;
		
		�̺κ��� �ִ밪�� ���ϴ� �����̴� 
		
		1. max�� a ���� �ִ´�.
		2. b ���� max���� ũ�� max�� b ���� �ִ´�.
		3. c ���� max���� ũ�� max�� c ���� �ִ´�.
		
		�̷��� ���� ������ ���������� ����Ǵ� ������ ������ ������� �Ѵ� 
		
		 */