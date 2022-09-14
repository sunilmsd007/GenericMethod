package generics;

import java.util.Scanner;

public class MaximumOf3NumbersInGenericMethod {

	<T extends Comparable<T>> void compare(T a, T b, T c) {
		
       if(a.compareTo(b)>0) {
    	   if(a.compareTo(c)>0) {
    	 	  System.out.println(a+ " is maximum among " +a+", " +b+", " +c);
    	   }
    	   else
		  System.out.println(c+ " is maximum among " +a+", " +b+", " +c);
        }
       else if(a.compareTo(b)<0) {
	   if(b.compareTo(c)>0) {
			System.out.println(b+ " is maximum among " +a+", " +b+", " +c);
	   }
           else
			System.out.println(c+ " is maximum among " +a+", " +b+", " +c);
	 }
   }
    public static void main(String[] args) {
    		MaximumOf3NumbersInGenericMethod m = new MaximumOf3NumbersInGenericMethod();

                m.compare(22,10,13);
		m.compare(1.1,1.2,1.3);
		m.compare("apple","peach","banana");
	}
}
