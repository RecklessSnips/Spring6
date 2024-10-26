package allAnnotation.Beans;

//@Component
public class Apprentice {


    private Master master;
    private String name;

    /*
        让 Spring 通过构造器，从context中创造这个bean, 前提是class带 @Component情况下
     */
//    @Autowired
//    public Apprentice(@Qualifier("anakin") Master master){
//        this.master = master;
//    }

    public Apprentice(Master master){
        this.master = master;
    }

    public void setMaster(Master master){
        this.master = master;
    }

    public Master getMaster(){
        return this.master;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Apprentice{" +
                "master=" + master.getName() +
                ", name='" + name + '\'' +
                '}';
    }
}
