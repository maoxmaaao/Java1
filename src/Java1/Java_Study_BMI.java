package Java1;

public class Java_Study_BMI {

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
		double height2=1.68;
		double weight2=75;
		double BMI=weight2/(height2*height2);
		System.out.println("BMI:"+BMI);
		
		//�얞�x
		double x=BMI;
		if(x>25) {
			System.out.println("�얞�x�F"+"�얞");
		}else if(x>=18.5 && x<=25) {
			System.out.println("�얞�x�F"+"�W��");
		}else if(x<18.5) {
			System.out.println("�얞�x�F"+"��̏d");
		}
	}

}
