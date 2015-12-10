package nutz_base;

import java.text.ParseException;

import org.apache.commons.lang.time.DateUtils;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(DateUtils.parseDate("2015-12-10 22:58:00",
					new String[] { "yyyy/MM/dd HH:mm:ss" }));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
