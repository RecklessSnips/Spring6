package autowire.annotation.service;

import autowire.annotation.repository.JediRepository;
import autowire.annotation.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JediService {

//    去找属性为Repo的实现类，但是因为有多个来实现，需要用到qualifier
//    用autowire和qualifier的结合来区分开interface的多个实现类
    @Autowired
    @Qualifier(value = "jediRepo")
    private Repo jedirRepository;

    @Autowired
    @Qualifier(value = "sithRepo")
    private Repo sithRepository;

    public void useForce(){
        System.out.println("Service use force...");
        jedirRepository.useForce();
        sithRepository.useForce();
    }
}
