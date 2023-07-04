package oops.encapsulation.getterSetter;

public class Book {
    String bookCategory;
    private String title;
    String author;
    int noOfCopies;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if (noOfCopies>50){
            this.noOfCopies = noOfCopies;
        }
        else{
            System.out.println("Book is not allowed to publish");
        }
    }
}
