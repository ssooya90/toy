import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by ssooya90@naver.com on 2020-04-08
 * Github : http://github.com/ssooya90
 */
public class OptionalStudy {

	public static void main(String[] args) {


		try{

			String str = "test";
			if (str != null) {
				System.out.println(str.charAt(0));
			}

			Optional<String> optStr = Optional.ofNullable(str);
			optStr.ifPresent(s -> System.out.println(s.charAt(0)));

			/**
			 * Optional.empty() : 빈 Optional 객체 생성한다
			 * Optional.of(value) : value값이 null이 아닌 경우에 사용한다
			 * Optional.ofNullable(value) : value값이 null인지 아닌지 확실하지 않은 경우에 사용한다
			 */

			Optional<String> optional = Optional.empty();
			System.out.println(optional);
			System.out.println(optional.isPresent());


		}catch (Exception e){

			e.printStackTrace();
		}




	}

}
