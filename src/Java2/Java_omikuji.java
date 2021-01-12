package Java2;

import java.util.Random;
import java.util.Scanner;

public class Java_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("‚ ‚È‚½‚Ì¡“ú‚Ì‚¨‚İ‚­‚¶‚ğˆø‚«‚Ü‚·B");
		
		//–¼‘O‚Ì“ü—Í
		Scanner scanner = new Scanner(System.in);
		System.out.println("‚ ‚È‚½‚Ì‚¨–¼‘O‚ÍH");
		String input_text = scanner.nextLine();
		
		//‚¨‚İ‚­‚¶
		String[] omikuji = {"‘å‹g", "‹g", "’†‹g", "¬‹g", "‹¥", "‘å‹¥"};
		Random r = new Random();
		String kekka = omikuji[r.nextInt(6)];
		
		//Œ‹‰Ê
		System.out.println(input_text + "‚³‚ñ‚Ì¡“ú‚Ì‚¨‚İ‚­‚¶‚ÌŒ‹‰Ê‚ÍEEEy"+ kekka + "z‚Å‚·I");
		}
	}


