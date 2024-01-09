package practice5;

public class Practice1 {

	public static void introduceOneself(String name) {
		System.out.println("私の名前は" + name + "です。");
	}
	
	public static void introduceOneself(int age) {
		System.out.println("歳は" + age + "歳です。");
	}
	
	public static void introduceOneself(double height) {
		System.out.println("身長は" + height + "cmです。");
	}
	
	public static void introduceOneself(char zodiac) {
		System.out.println("十二支は" + zodiac + "です。");
	}
	
	public static void main(String[] args) {
		introduceOneself("玉井裕人");
		introduceOneself(23);
		introduceOneself(167.7);
		introduceOneself('辰');
	}

}
