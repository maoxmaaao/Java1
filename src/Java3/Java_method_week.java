package Java3;

public class Java_method_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int days=7;
		//String[] japanese= {"��","��","��","��","��","�y","��"};
		//String[] english= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		//for (int day=0; day<days; day++)
		//{
		//	System.out.println(japanese[day]+"�j���͉p��ł�"+english[day]+"�ł�");
		//}
		week("��","monday");
		week("��","tuesday");
		week("��","wednesday");
		week("��","thursday");
		week("��","fryday");
		week("�y","saturday");
		week("��","sunday");
		
		
		
		//int colors=8;
		//String[] jap= {"��","��","��","��","��","��","�D","��"};
		//String[] eng= {"red","blue","yellow","green","white","black","gray","purple"};
		//for (int color=0; color<colors; color++)
		//{
		//	System.out.println(jap[color]+"�͉p���"+eng[color]);
		//}
		color("��","red");
		color("��","blue");
		color("��","yellow");
		color("��","green");
		color("��","");
		color("��","red");
		color("�D","red");
		color("��","red");
		
	}
	
	public static void week(String japanese , String english) {
		System.out.println(japanese + "�j���͉p���" + english + "�ł�");
	}
	
	public static void color(String JAP, String ENG) {
		System.out.println(JAP +"�F�͉p���"+ ENG+ "�ł�");
	}

}
