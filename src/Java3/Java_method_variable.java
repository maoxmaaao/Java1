package Java3;

public class Java_method_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//計算10+3
		int rtnNumber1=number1(10);
		System.out.println(rtnNumber1);
		
		//計算5+13（前の計算結果引用）
		//int number2=5;
		//System.out.println(number1+number2);
		int rtnNumber2=number2(5,rtnNumber1);
		System.out.println(rtnNumber2);
		
		//こんにちは佐藤さん
		//String greeting="こんにちは";
		//System.out.println(greeting+"佐藤さん");
		aisatsu("こんにちは");
		
		//こんにちは鈴木さん
		//String name="鈴木さん";
		//System.out.println(greeting+name);
		NM("鈴木さん","こんにちは");
	}

	public static int number1(int NMB) {
		return NMB + 3 ;
	}
	
	public static int number2(int NMB2,int NMB3){
		return NMB2 + NMB3 ;
	}
	
	public static void aisatsu(String greeting) {
		System.out.println(greeting + "佐藤さん");
	}
	
	public static void NM(String name, String greeting) {
		System.out.println(greeting + name);
	}
}
