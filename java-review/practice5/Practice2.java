package practice5;

public class Practice2 {
	
	public static void email() {
		String title = "おはよう";
		String address = "hiro@1670.com";
		String text = "朝ごはん食べた？";
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		email();
	}
}
