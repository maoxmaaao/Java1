package Java2;

public class Java_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=5; i++){
			System.out.println("��������"+i+"�C�����");
		}
		
		//10~0�܂ŃJ�E���g�_�E��
		for(int i=10; i>=0; i--) {
			System.out.println(i);
		}
		
		//���A�O�̒i��\��
		int x=3;
		for(int i=1; i<=9; i++) {
			System.out.println(x+"�~"+i+"="+(x*i));
		}
		
		//2��1�悩��8��܂Ōv�Z
		int y=2;
		for(int i=1; i<=8; i++) {
			System.out.println("2��"+i+"���"+(y=y*2));
		}
	}

}
