package Java2;

public class Java_tanakatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���O
		String Student_name="�c��";
		
		//����
		double japanese_score=85;
		
		//���w
		double math_score=66;
		
		System.out.println(Student_name+"����̍���̓_����"+japanese_score+"�_�ł��B");
		
		System.out.println(Student_name+"����̐��w�̓_����"+math_score+"�_�ł��B");
		
		//���ϓ_
		double avarage_score=(japanese_score+math_score)/2;
		System.out.println(Student_name+"����̕��ϓ_��"+avarage_score+"�_�ł��B");
		
		//���ior�s���i
		double x=avarage_score;
		if(x>70) {
			System.out.println("���i");
		}else if(x<=70) {
			System.out.println("�s���i");
		}
	}

}
