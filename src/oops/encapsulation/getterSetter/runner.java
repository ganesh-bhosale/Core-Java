package oops.encapsulation.getterSetter;

public class runner {
    public static void main(String [] args) {

        Book book = new Book();

        book.bookCategory = "Self Help";
        System.out.println(book.bookCategory);

        book.setTitle("Atomic Habit");
        System.out.println(book.getTitle());

        book.setNoOfCopies(100);
        System.out.println(book.getNoOfCopies());

        book.setAuthor("James Clear");
        System.out.println(book.getAuthor());
    }
}
