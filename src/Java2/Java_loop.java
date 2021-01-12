package Java2;

public class Java_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=5; i++){
			System.out.println("うさぎが"+i+"匹いるよ");
		}
		
		//10~0までカウントダウン
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		
		//九九、三の段を表示
		int x=3;
		for(int i=1; i<=9; i++) {
			System.out.println(x+"×"+i+"="+(x*i));
		}
		
		//2の1乗から8乗まで計算
		int y=2;
		for(int i=1; i<=8; i++) {
			System.out.println("2の"+i+"乗は"+(y=y*2));
		}
	}

}
