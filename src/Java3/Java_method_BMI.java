package Java3;

public class Java_method_BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���O
		String name="��؂���";
		System.out.println("���O�F"+name);
		
		//�g��
		int height=168;
		System.out.println("�g���F"+height+"cm");
		
		//�̏d
		int weight=43;
		System.out.println("�̏d�F"+weight+"kg");
		
		//BMI
		//double height2=1.68;
		//double weight2=75;
		//double BMI=weight2/(height2*height2);
		double rtnBMI = BMIkeisan(1.68,43);
		System.out.println("BMI:"+rtnBMI);
		
		//�얞�x
		String rtnBMI3 = BMIkekka(rtnBMI);
		System.out.println(rtnBMI3);
		//double x=BMI;
		//if(x>25) {
		//	System.out.println("�얞�x�F�얞");
		//}else if(x>=18.5 && x<=25) {
		//	System.out.println("�얞�x�F�W��");
		//}else if(x<18.5) {
		//	System.out.println("�얞�x�F��̏d");
		//}
	}
	
	public static double BMIkeisan(double height3, double weight3) {
		return weight3/(height3*height3);
	}
	
	public static String BMIkekka(double rtnBMI2) {
		if(rtnBMI2>25) {
			return "�얞�x�F�얞";
			
		}else if(rtnBMI2>=18.5 && rtnBMI2<=25) {
			return "�얞�x�F�W��";
			
		}else {
			return "�얞�x�F��̏d";
		}
		
	}

}
