import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrcticeMap {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
//		要素の追加
		map1.put(0, "ぶどう");
		map1.put(3,  "もも");
		System.out.println(map1);
//		→登録済みのキーの上書き
		map1.put(0, "マスカット");
		System.out.println(map1);
//		要素の取得
		System.out.println(map1.get(0));
//		→値がない時はnullを返す
		System.out.println(map1.get(1));
//		要素の存在のチェック
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsKey("ぶどう"));
//		要素数の取得
		System.out.println(map1.size());
//		要素の削除
		map1.remove(0);
		map1.remove(1);
		System.out.println(map1);
		map1.remove(3, "もも");
		map1.remove(3, "なし");
		System.out.println(map1);
	}

}
