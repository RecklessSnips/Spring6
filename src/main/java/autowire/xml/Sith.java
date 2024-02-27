package autowire.xml;

public class Sith {
    private Jedi jedi;

    public void setJedi(Jedi jedi){
        this.jedi = jedi;
    }

    public void info(){
        System.out.println("Sith success!!!");
        jedi.info();
    }
}
