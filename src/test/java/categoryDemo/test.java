package categoryDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.dao.CategoryDemoDAO;
import com.demo.model.CategoryDemo;

public class test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.demo");
		con.refresh();

		CategoryDemoDAO cdao = (CategoryDemoDAO) con.getBean("categoryDemoDAO");

		CategoryDemo ct = (CategoryDemo) con.getBean("categoryDemo");

		ct.setName("firdst");
		ct.setDescription("this is just added");

		cdao.saveOrUpdate(ct);

	}
}
