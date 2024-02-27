package autowire.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJedi {

    @Test
    public void testAuto(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jedi.xml");
        Sith vader = applicationContext.getBean("sith", Sith.class);
        vader.info();
    }
}
