package Java3;

public class Java_method_week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int days=7;
		//String[] japanese= {"Œ","‰Î","…","–Ø","‹à","“y","“ú"};
		//String[] english= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		//for (int day=0; day<days; day++)
		//{
		//	System.out.println(japanese[day]+"—j“ú‚Í‰pŒê‚Å‚Í"+english[day]+"‚Å‚·");
		//}
		week("Œ","monday");
		week("‰Î","tuesday");
		week("…","wednesday");
		week("–Ø","thursday");
		week("‹à","fryday");
		week("“y","saturday");
		week("“ú","sunday");
		
		
		
		//int colors=8;
		//String[] jap= {"Ô","Â","‰©","—Î","”’","•","ŠD","‡"};
		//String[] eng= {"red","blue","yellow","green","white","black","gray","purple"};
		//for (int color=0; color<colors; color++)
		//{
		//	System.out.println(jap[color]+"‚Í‰pŒê‚Å"+eng[color]);
		//}
		color("Ô","red");
		color("Â","blue");
		color("‰©","yellow");
		color("—Î","green");
		color("”’","");
		color("•","red");
		color("ŠD","red");
		color("‡","red");
		
	}
	
	public static void week(String japanese , String english) {
		System.out.println(japanese + "—j“ú‚Í‰pŒê‚Å" + english + "‚Å‚·");
	}
	
	public static void color(String JAP, String ENG) {
		System.out.println(JAP +"F‚Í‰pŒê‚Å"+ ENG+ "‚Å‚·");
	}

}
