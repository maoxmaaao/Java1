package Java3;

public class Java_method_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�v�Z10+3
		int rtnNumber1=number1(10);
		System.out.println(rtnNumber1);
		
		//�v�Z5+13�i�O�̌v�Z���ʈ��p�j
		//int number2=5;
		//System.out.println(number1+number2);
		int rtnNumber2=number2(5,rtnNumber1);
		System.out.println(rtnNumber2);
		
		//����ɂ��͍�������
		//String greeting="����ɂ���";
		//System.out.println(greeting+"��������");
		aisatsu("����ɂ���");
		
		//����ɂ��͗�؂���
		//String name="��؂���";
		//System.out.println(greeting+name);
		NM("��؂���","����ɂ���");
	}

	public static int number1(int NMB) {
		return NMB + 3 ;
	}
	
	public static int number2(int NMB2,int NMB3){
		return NMB2 + NMB3 ;
	}
	
	public static void aisatsu(String greeting) {
		System.out.println(greeting + "��������");
	}
	
	public static void NM(String name, String greeting) {
		System.out.println(greeting + name);
	}
}
