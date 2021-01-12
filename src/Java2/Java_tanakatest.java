package Java2;

public class Java_tanakatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//名前
		String Student_name="田中";
		
		//国語
		double japanese_score=85;
		
		//数学
		double math_score=66;
		
		System.out.println(Student_name+"さんの国語の点数は"+japanese_score+"点です。");
		
		System.out.println(Student_name+"さんの数学の点数は"+math_score+"点です。");
		
		//平均点
		double avarage_score=(japanese_score+math_score)/2;
		System.out.println(Student_name+"さんの平均点は"+avarage_score+"点です。");
		
		//合格or不合格
		double x=avarage_score;
		if(x>70) {
			System.out.println("合格");
		}else if(x<=70) {
			System.out.println("不合格");
		}
	}

}
