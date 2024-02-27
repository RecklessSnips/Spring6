package xml_Bean.DI;

public class Author {

    private String name;
    private String company;

    public Author(){

    }

    public Author(String name, String company){
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
