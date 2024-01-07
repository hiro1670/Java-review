package capter5;

public class ReturnValue_Asis {

	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(add(add(10, 20), add(30, 40)));
	}

}
