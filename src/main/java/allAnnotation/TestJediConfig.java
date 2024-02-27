package allAnnotation;

import autowire.annotation.controller.JediController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJediConfig {

    public static void main(String[] args) {
        //依然可以完美实现所有功能，实现全注解开发
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        JediController ahsoka = context.getBean("jediController", JediController.class);
        ahsoka.useForce();
    }
}
