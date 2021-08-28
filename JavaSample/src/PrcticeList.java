import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrcticeList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
//		要素の追加
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		System.out.println(list1);
//		要素の取得
		System.out.println(list1.get(0));
//		要素の存在のチェック
		list1.contains("バナナ");
		list1.contains("なし");
		System.out.println(list1);
//		要素数の取得
		System.out.println(list1.size());
//		要素の削除
		list1.remove("バナナ");
		list1.remove("なし");
		list1.remove(0);
//		list1.remove(5);
		System.out.println(list1);
	}
}
