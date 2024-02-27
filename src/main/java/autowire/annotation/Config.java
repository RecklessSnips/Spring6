package autowire.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//表明这是一个配置类
@Configuration
//像xml里一样表明要扫描的范围(base_package)
@ComponentScan("autowire")
public class Config {
}
