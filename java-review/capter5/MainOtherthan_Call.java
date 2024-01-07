package capter5;

public class MainOtherthan_Call {
	
	public static void main(String[] args) {
		methodA();
	}
	
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("methodB");
	}

}
