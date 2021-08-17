
public class Chapter08 {
	public static void main(String[] args) {
//		問題1
		int number = 1;
		int count = 0;
		while (count < 5) {
			System.out.println(number * number);
			number++;
			count++;
		}

//		問題2
		int[] array = { 11, 27, 36, 48 };
		for (int num = 0; array.length > num; num++) {
			System.out.println(array[num]);
		}

//		問題3
		for (int n : array) {
			if (n % 2 == 0) {
				continue;
		}
		System.out.println(n);
		}
	}

}

//解答
//public class Chapter08 {
//    public static void main(String[] args) {
//        // 1.「while」文
//        int num = 1;
//        while (num < 5) {
//            System.out.println(num * num);
//            num++;
//        }
//        // 2. 通常「for」文
//        int array[] = { 1, 4, 14, 25 };
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        // 3. 拡張「for」文
//        for (int val : array) {
//            if (val % 2 == 0) {
//                continue;
//            }
//            System.out.println(val);
//        }
//    }
//}