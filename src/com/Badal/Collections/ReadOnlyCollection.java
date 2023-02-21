package com.Badal.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

    /**
     * Java Program to create read only Collection in Java.
     * apparently you can make any
     * Collection read only by using
     * Collections.unmodifiableCollection(), there are separate
     * method for List and Set as well.
     *
     * @author Javin Paul
     */
    public class ReadOnlyCollection {


        public static void main(String args[]) {
            //creating read only Collection in Java
            Collection readOnlyCollection = Collections.unmodifiableCollection(new ArrayList<String>());
            readOnlyCollection.add("Sydney Sheldon"); //raises UnSupportedOperation exception

            //making existing ArrayList readonly in Java

            List unmodifiableList = List.of("Jeffrey Archer", "Khalid Hussain");

            //add will throw Exception because List is readonly
            unmodifiableList.add("R.K. Narayan");

            //remove is not allowed in unmodifiable list
            unmodifiableList.remove(0);

            //set is not allowed in unmodifiable List
            unmodifiableList.set(0, "Anurag Kashyap");

//creating Fixed Length List from Array in Java
            List fixedLengthList = Arrays.asList("Mark" , "Twen");
            // readOnlyList.add("J.K. Rowling"); //raises Exception

            fixedLengthList.set(0, "J.K. Rowling"); //allowed that's why not read only list
            System.out.println(fixedLengthList.get(0));
        }

}