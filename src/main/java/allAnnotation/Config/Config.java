package allAnnotation.Config;

import allAnnotation.AOP.MyCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "allAnnotation")
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public MyCalculator calculator(){
        return new MyCalculator();
    }
}
