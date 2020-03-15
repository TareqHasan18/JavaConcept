package OOPConcept;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.sum(40, 50);
        obj.sum(10, 20, 30);

    }

    //We can overload main method also
    //we can not create a method inside a method
    //Duplicate method -- > i.e. same method name with same number of arguments are not allowed

    //Method overloading is when the method name is same with different arguments or input parameters within the same class
    public void sum(){
        System.out.println("Method with zero param");
    }

    public void sum(int i, int j){
        System.out.print("Sum of i and j is: ");
        System.out.println(i+j);
    }

    public void sum(int i, int j, int k){
        System.out.print("Sum of i, j and k is : ");
        System.out.println(i+j+k);
    }
}
