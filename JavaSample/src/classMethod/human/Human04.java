package classMethod.human;

public class Human04 {
//	static変数
	static public int humanCount = 0;
	public String name;
//	定数
	public static final String GREETING = "こんにちは";
	
	public Human04(String name) {
		this.name = name;
//		インスタンス生成ごとにstatic変数に+する
		Human04.humanCount++;
	}
	
	static public void staticMethodPrint() {
		
		System.out.println("人の数は" + Human04.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}

}
