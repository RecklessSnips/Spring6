package allAnnotation.Beans;

//@Component
public class Master {

    private Apprentice apprentice;
    private String name;

    public Master(String name){
        this.name = name;
    }

    public void setApprentice(Apprentice apprentice){
        this.apprentice = apprentice;
    }

    public Apprentice getApprentice(){
        return this.apprentice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Master{" +
                "apprentice=" + apprentice +
                ", name='" + name + '\'' +
                '}';
    }
}
