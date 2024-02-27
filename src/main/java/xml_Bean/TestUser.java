package xml_Bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void getUserByID(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("Get Bean by ID: " + user);
    }


    @Test
    public void reflectionCreatuser() throws Exception {
        Class clazz = Class.forName("xml_Bean.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        user.intro();
    }
}
