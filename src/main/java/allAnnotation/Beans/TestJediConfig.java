package allAnnotation.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TestJediConfig {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        for(String name: context.getBeanDefinitionNames()){
            System.out.println("Bean: " + name);
        }
        Master anakin = context.getBean("anakin", Master.class);
        System.out.println(anakin);
        Apprentice ahsoka = context.getBean(Apprentice.class);

        System.out.println(ahsoka);
    }
}
