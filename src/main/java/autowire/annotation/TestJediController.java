package autowire.annotation;

import autowire.annotation.controller.JediController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJediController {

    @Test
    public void byClass(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        JediController ahsoka = context.getBean("jediController", JediController.class);
        ahsoka.useForce();
    }

    @Test
    public void byXML(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("person.xml");
        JediController ahsoka = context.getBean("jediController", JediController.class);
        ahsoka.useForce();
    }
}
