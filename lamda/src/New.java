public class New {

	// 람다식 이후
	public static void main(String[] args) {
		Goods com = () -> System.out.println("do Operation!@");
		com.doSome();
	}

}
