package Java2;



public class Java_guusuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("配列内の偶数は以下の数値です。");
		int[] numbers = {32, 79, 35, 25, 82, 77, 34, 16, 61, 39};
		for (int num : numbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		
	}

}
