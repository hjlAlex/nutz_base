package nutz_base;

import org.nutz.dao.Chain;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.impl.SimpleDataSource;
import org.nutz.mvc.annotation.Encoding;

@Encoding(input = "", output = "")
public class Test {

	public static void main(String[] args) {
		SimpleDataSource sds = new SimpleDataSource();
		sds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=UTF8&amp;autoReconnect=true&amp;failOverReadOnly=false");
		sds.setUsername("root");
		sds.setPassword("root");
		NutDao dao = new NutDao(sds);
		Chain ch = Chain.make("name", "黄杰龙");
		ch.add("age", 24);
		dao.insert("person", ch);
	}
}
