package xml_Bean.DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void testSetter(){
        /*
            通过setter注入，需要先通过无参构造器建立，再通过setter来建立，所以无参构造器会被调用
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
    }

    @Test
    public void testConstructor(){
        /*
            只有有参构造器会被调用，因为是通过constructor直接注入
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
        Book book2 = context.getBean("book2", Book.class);
        System.out.println(book2.getaUTHOR());
    }
}
