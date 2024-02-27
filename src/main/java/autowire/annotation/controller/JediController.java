package autowire.annotation.controller;

import autowire.annotation.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//给这个controller的bean命名, 相当于bean的id
@Controller(value = "jediController")
public class JediController {

    //自动去找"属性"为JediService的bean
    @Autowired
    private JediService service;

    public void useForce(){
        System.out.println("Controller use force...");
        service.useForce();
    }
}
