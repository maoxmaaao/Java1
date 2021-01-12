package Java1;

public class Java_Study_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//名前
		String name="鈴木えみ";
		System.out.println("名前："+name);
		
		//身長
		int height=168;
		System.out.println("身長："+height+"cm");
		
		//体重
		int weight=43;
		System.out.println("体重："+weight+"kg");
		
		//BMI
		double height2=1.68;
		double weight2=75;
		double BMI=weight2/(height2*height2);
		System.out.println("BMI:"+BMI);
		
		//肥満度
		double x=BMI;
		if(x>25) {
			System.out.println("肥満度："+"肥満");
		}else if(x>=18.5 && x<=25) {
			System.out.println("肥満度："+"標準");
		}else if(x<18.5) {
			System.out.println("肥満度："+"低体重");
		}
	}

}
