package Java2;

import java.util.Random;
import java.util.Scanner;

public class Java_janken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//=============変数定義=============
		Scanner scan = new Scanner(System.in);//新規スキャナークラスの作成
		Random random = new Random();//新規ランダムクラスの作成
		String[] RPS = {"グー","チョキ","パー"};//じゃんけん配列
		int playerWin = 0;//プレイヤー勝利数の初期値
		int cpWin = 0; //CP勝利数の初期値
		//=================================
		
		//==========じゃんけん処理文　START===========
		//じゃんけんゲームスタート
		System.out.println("じゃんけん3回勝つまで帰れまSEN:)");
		System.out.println("お名前をどうぞ");
		
		//-----名前入力-----
		String playerName = scan.nextLine();
		System.out.println(playerName + "、こんにちは!!!");
		
		//~~~~~~~~~~3回勝つまで終われません！　～始～~~~~~~~~~~
		while (playerWin < 3 && cpWin < 3) {
		
		//-----じゃんけんポン-----
		System.out.println("【0】【1】【2】どれにする？");
		System.out.println("（※【0】：グー　【1】：チョキ　【2】パー　半角数字で！）");
		
		//-----じゃんけんの値を入力したらスキャンしてplayerRPSに格納-----
		int playerRPS = scan.nextInt();
		
		//-----CPのじゃんけんの値をランダムに選出しcpRPSに格納-----
		int cpRPS = random.nextInt(3);
		
		//プレイヤーとCPのじゃんけん値を表示
		System.out.println(playerName + " ➡ " + RPS[playerRPS]);
		System.out.println("CP ➡　" + RPS[cpRPS]);
		
		//==========判定処理==========
		//-----プレイヤーが勝つ場合-----
		if ((playerRPS == 0 && cpRPS == 1) || (playerRPS == 1 && cpRPS == 2) || (playerRPS == 2 && cpRPS == 0)) {
			System.out.println(playerName + "の勝ち!!!");
			playerWin++;
			System.out.println(playerName + playerWin +"勝"+ cpWin +"敗");
			
		//-----プレイヤーが負ける場合-----
		}else if ((playerRPS == 0 && cpRPS == 2) || (playerRPS == 1 && cpRPS == 0) || (playerRPS == 2 && cpRPS == 1)){
			System.out.println("負けぇ～");
			cpWin++;
			System.out.println(playerName + playerWin +"勝"+ cpWin +"敗");
			
		//-----あいこの場合-----
		}else if ((playerRPS == 0 && cpRPS == 0) || (playerRPS == 1 && cpRPS == 1) || (playerRPS == 2 && cpRPS == 2)) {
			System.out.println("あいこでしょ!!");
		}
		
		}
		//~~~~~~~~~~3回勝つまで終われません！　～終～~~~~~~~~~~
		
		//==========じゃんけん処理文　END==========
		}
		
	}


