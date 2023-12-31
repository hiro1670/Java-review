package practice3;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int weight = 60;
		if (weight == 60) {
			System.out.println("変数weightの値が60に等しい");
		}
		
		int age1 = 40;
		int age2 = 50;
		int age3 = age1 + age2 * 2;
		if (age3 > 60) {
			System.out.println("変数age1とage2の合計を2倍したものが60を越えている");
		}
		
		int age = 3;
		if (!(age % 2 == 0)) {
			System.out.println("変数ageが奇数である");
		}
		
		String name = "湊";
		if (name.equals("湊")) {
			System.out.println("変数nameに代入された文字列が「湊」と等しい");
		}
	}
}
