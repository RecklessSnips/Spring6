package autowire.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository(value = "sithRepo")
public class SithRepository implements Repo{

    public void useForce(){
        System.out.println("Sith Repo use force...");
    }
}
