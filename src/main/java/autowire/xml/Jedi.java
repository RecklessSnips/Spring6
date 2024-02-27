package autowire.xml;

public class Jedi {

    private Lightsaber saber;

    public void setSaber(Lightsaber saber){
        this.saber = saber;
    }

    public void info(){
        System.out.println("jedi success!!!");
        saber.info();
    }
}
