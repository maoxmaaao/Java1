package Java2;

import java.util.Random;
import java.util.Scanner;

public class Java_omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("あなたの今日のおみくじを引きます。");
		
		//名前の入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたのお名前は？");
		String input_text = scanner.nextLine();
		
		//おみくじ
		String[] omikuji = {"大吉", "吉", "中吉", "小吉", "凶", "大凶"};
		Random r = new Random();
		String kekka = omikuji[r.nextInt(6)];
		
		//結果
		System.out.println(input_text + "さんの今日のおみくじの結果は・・・【"+ kekka + "】です！");
		}
	}


