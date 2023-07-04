package oops.inheritance.language;

public class Python extends Programming {
    String newFeature;

    Python(int version, String author, String nf){
        super(version, author);
        this.newFeature = nf;
    }

    void printPDetails(){
        this.printLangInfo();
        System.out.println("New added feature is "+this.newFeature);
    }
}
