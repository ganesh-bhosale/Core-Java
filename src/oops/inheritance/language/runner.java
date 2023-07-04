package oops.inheritance.language;

public class runner {
    public static void main(String [] args){

        java javaobj = new java(19, "RK Ghosling", "Lambda Expression");
        javaobj.printJDetails();

        Python pythonobj = new Python(9, "James Clear", "Selenium library");
        pythonobj.printPDetails();
    }
}
