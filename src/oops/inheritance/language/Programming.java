package oops.inheritance.language;

public class Programming {
    int version;
    String author;

    Programming(int version, String author){
        this.version = version;
        this.author = author;
    }

    void printLangInfo(){
        System.out.println("The programming language is "+this.version+" and author is "+this.author);
    }
}
