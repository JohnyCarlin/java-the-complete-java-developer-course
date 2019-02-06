import java.util.Stack;

import static java.lang.Math.abs;

public class Hello {
    public static void main(String[] args) {


        System.out.println("Hello, John!");

        int myFirstNumber = 5 + 5;

        int mySecondNumber = 12;

        int myTotal = myFirstNumber + mySecondNumber;




        Stack myStack = new Stack();

        for ( int i = 0 ; i < 10 ; i ++) myStack.push((Integer) i);

        for (int i =0; i < 10; i ++) System.out.println(myStack.pop());

        System.out.println(abs(-5));

    }
}
