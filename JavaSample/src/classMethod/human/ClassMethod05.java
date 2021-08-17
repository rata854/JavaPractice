package classMethod.human;

public class ClassMethod05 {
	public static void main(String[] args) {
		Human05 yamada = new Human05();
		
        //nameとageはprivateな変数なので直接参照はできない
        // ☓ System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		System.out.println("名前は" + yamada.getName() + "で、年齢は" + yamada.getAge() + "です。");
	}

}
