package aorquerab.functionalprogramming;

import java.util.function.Function;

public class FP {

    //Function<T,R> It takes an input of type T and produces an output of type R

    //Transforms an Integer to an Integer*2
    Function <Integer,Integer> doubleFunction = x -> x*2;
    Integer doubleFunctionResult = doubleFunction.apply(5);

    //Transforms a String to its length
    Function <String,Integer> stringToLength = s->s.length(); //or = String::length
    Integer stringToLengthResult = stringToLength.apply("Der Hund");

    public void printFunction () {
        System.out.println("Double is: " + doubleFunctionResult);
        System.out.println("The String has this length: " +stringToLengthResult);
    }
}
