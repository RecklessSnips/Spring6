package xml_Bean.DI;

public class Book {

    private String name;
    private String author;
    private Author aUTHOR;

    public Book(){
        System.out.println("无参构造器");
    }

    public Book(String name, String author, Author aUTHOR) {
        System.out.println("有参构造器");
        this.name = name;
        this.author = author;
        this.aUTHOR = aUTHOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getaUTHOR() {
        return aUTHOR.getName();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", aUTHOR=" + aUTHOR +
                '}';
    }
}
