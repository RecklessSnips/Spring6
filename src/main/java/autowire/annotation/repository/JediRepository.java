package autowire.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "jediRepo")
public class JediRepository implements Repo{

    public void useForce(){
        System.out.println("Jedi Repo use force...");
    }
}
