//問題1
public class Chapter07 {
	public static void main(String[] args) {
		int val = 13;
		if (val <= 5) {
			System.out.println("とても近いです");
		} else if (val <= 10) {
			System.out.println("近いです");
		} else if (val <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

//問題2
		String  color = "yellow";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黃信号です");
			break;
		case "blue":
		    System.out.println("青信号です");
		    break;
		default:
			System.out.println("信号機の色ではありません");
		}
	}
}