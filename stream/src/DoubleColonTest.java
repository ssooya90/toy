import java.util.Arrays;
import java.util.List;

public class DoubleColonTest {

	// :: 기능 알아보기
	// 정식 명칭 : 메소드 참조 표현식(method reference expression
	// 사용법 [인스턴스]::[메소드명(또는 new)}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("김갑순", "김갑돌");
		;
		DoubleColonTest dct = new DoubleColonTest();
		names.stream().map(x -> dct.addNim(x)).forEach(System.out::println); // 적용 전
		names.stream().map(dct::addNim).forEach(System.out::println); // 적용 후
	}

	public String addNim(String s) {
		return s + "님";
	}
}
