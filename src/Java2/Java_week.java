package Java2;

public class Java_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days=7;
		String[] japanese= {"��","��","��","��","��","�y","��"};
		String[] english= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		for (int day=0; day<days; day++)
		{
			System.out.println(japanese[day]+"�j���͉p��ł�"+english[day]+"�ł�");
		}
	
		int colors=8;
		String[] jap= {"��","��","��","��","��","��","�D","��"};
		String[] eng= {"red","blue","yellow","green","white","black","gray","purple"};
		for (int color=0; color<colors; color++)
		{
			System.out.println(jap[color]+"�͉p���"+eng[color]);
		}
	}

}
