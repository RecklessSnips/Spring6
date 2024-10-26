package allAnnotation.AOP;

import allAnnotation.Config.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCalculator {

    @Test
    public void testCalculator(){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);
        // 实现了接口，所以必须通过接口调用
        Calculator myCalculator = context.getBean("calculator", Calculator.class);
        myCalculator.add(1, 1);
        System.out.println("-------------------");
//        myCalculator.divide(1, 0);
        System.out.println("-------------------");
        myCalculator.divide(1, 1);
    }
}
