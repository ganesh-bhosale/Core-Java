package oops.interfaces;

// Java Program to demonstrate working of interface
// A simple interface
interface Int1{

    // public, static and final
    int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface
class TestClass implements Int1 {

    // implementing the capabilities of interface

    public void display(){
        System.out.println("This method is implemented using Interface");
    }

    public static void main(String [] args){
        TestClass tc = new TestClass();
        tc.display();
        System.out.println(a);
    }

}
