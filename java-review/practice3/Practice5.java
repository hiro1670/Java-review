package practice3;

public class Practice5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数あてゲーム");
		int ans = new java.util.Random().nextInt(9);
		System.out.println("0~9の数字を入力してください");
		for (ans = 0; ans < 5; ans++) {
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
