package practice5;

public class Practice3 {
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		email("hiro@.com", "朝ごはん食べた？");
	}
}
