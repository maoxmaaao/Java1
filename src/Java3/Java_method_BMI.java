package Java3;

public class Java_method_BMI {

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
		//double height2=1.68;
		//double weight2=75;
		//double BMI=weight2/(height2*height2);
		double rtnBMI = BMIkeisan(1.68,43);
		System.out.println("BMI:"+rtnBMI);
		
		//肥満度
		String rtnBMI3 = BMIkekka(rtnBMI);
		System.out.println(rtnBMI3);
		//double x=BMI;
		//if(x>25) {
		//	System.out.println("肥満度：肥満");
		//}else if(x>=18.5 && x<=25) {
		//	System.out.println("肥満度：標準");
		//}else if(x<18.5) {
		//	System.out.println("肥満度：低体重");
		//}
	}
	
	public static double BMIkeisan(double height3, double weight3) {
		return weight3/(height3*height3);
	}
	
	public static String BMIkekka(double rtnBMI2) {
		if(rtnBMI2>25) {
			return "肥満度：肥満";
			
		}else if(rtnBMI2>=18.5 && rtnBMI2<=25) {
			return "肥満度：標準";
			
		}else {
			return "肥満度：低体重";
		}
		
	}

}
