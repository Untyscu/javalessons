package hash;

public class Book {
    public String name;
    public String author;
    // year of publishing
    public int yop;
    public Book(String name, String author, int yop){
        this.name = name;
        this.author = author;
        this.yop = yop;
    }
    public String getInfo(){
        String info = author+" "+name+" - "+yop+" year.";
        return info;
    }
}
