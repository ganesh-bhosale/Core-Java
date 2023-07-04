package oops.inheritance.language;

public class java extends Programming {

    String newFeature;

    java(int version, String author, String newFeature){
        super(version, author);
        this.newFeature = newFeature;
    }

    public void printJDetails(){
        this.printLangInfo();
        System.out.println("New added feature is "+this.newFeature);
    }
}
