package Java2;

import java.util.Random;
import java.util.Scanner;

public class Java_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���Ȃ��̍����̂��݂����������܂��B");
		
		//���O�̓���
		Scanner scanner = new Scanner(System.in);
		System.out.println("���Ȃ��̂����O�́H");
		String input_text = scanner.nextLine();
		
		//���݂���
		String[] omikuji = {"��g", "�g", "���g", "���g", "��", "�勥"};
		Random r = new Random();
		String kekka = omikuji[r.nextInt(6)];
		
		//����
		System.out.println(input_text + "����̍����̂��݂����̌��ʂ́E�E�E�y"+ kekka + "�z�ł��I");
		}
	}


