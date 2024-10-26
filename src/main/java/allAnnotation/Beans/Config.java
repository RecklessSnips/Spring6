package allAnnotation.Beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//表明这是一个配置类
@Configuration
//像xml里一样表明要扫描的范围(base_package)
@ComponentScan(basePackages = {"allAnnotation"})
public class Config {

    /*
        可以通过Bean来引入另一个bean，这样所以依赖的bean会被从context中拿取

        如果有多个一样的instance，通过 Qualifier 来区别
        也可以通过给 Bean 加一个名字：@bean(name = "anakin")
        这样在查找所有的bean的时候，可以通过这个名字来查找，而不是默认的方法名
        for(String name: context.getBeanDefinitionNames()){
            System.out.println(name);
        }
     */
    @Bean(name = "anakin")
    public Master master1(){
        return new Master("Anakin");
    }

    @Bean(name = "plokon")
    @Qualifier("plokon")
    public Master master2(){
        return new Master("Plo Kon");
    }

    /*
        如果有两个相同class的 instance，无法 autowire
        可以通过 Qualifier 来根据想要 bean 的名称（或者该bean的qualifier也行）
     */
    @Bean(name = "ahsoka")
    public Apprentice apprentice(@Qualifier("anakin") Master master){
        return new Apprentice(master);
    }
}
