package Java.src.exception_handling;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Exception_1 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc=new Scanner(System.in);
        // try{
        // int a=5;
        // int b=a/5;
        // System.out.println(b);

        // int c[]={1};
        // c[42]=99;
        // }
        // catch(ArithmeticException e){
        // System.out.println("Cannot divide by zero");
        // }
        // catch(NullPointerException e){
        // System.out.println("String is empty");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.println("Stay in limit");
        // }

        // LinkedList<Integer> list = new LinkedList<Integer>();
        // list.add(4);
        // list.add(6);
        // list.add(8);
        // System.out.println(list);
        // // values.add(2);
        // // values.add(34);
        // // System.out.println(values);

        // Iterator it=list.iterator();
        // //System.out.println(it.next());
        // //System.out.println(it.next());
        // //System.out.println(it.next());

        // while(it.hasNext()){
        // System.out.println(it.next());
        // }
        try{
            int a=Integer.parseInt("a1");
            System.out.println(a);
        }
        catch(NumberFormatException e){
           System.out.println("Number format exception occured");
        }
        finally{
            System.out.println("HI");
        }
    }
}