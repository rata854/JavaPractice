import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrcticeSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
//		要素の追加
		set1.add("スイカ");
		set1.add("メロン");
		System.out.println(set1);
//		要素の取得は繰り返し処理で
//		要素の存在チェック
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
//		要素数の取得
		System.out.println(set1.size());
//		要素の削除
		set1.remove("スイカ");
		set1.remove("なし");
		System.out.println(set1);
	}
}
