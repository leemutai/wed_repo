/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company;

/**
 *
 * @author user
 */
//java program to demonsrate boolean data type
/*public class data_types {
    public static void main(String[] args)
    {
        boolean b = true;
        if (b== true);
        System.out.println("hi lee!");

    }



}*/

/*public class data_types{
    public static void main(String[] args) {
        byte a = 126;
        //byte is a 8 bit value
        System.out.println(a);

        a++;
        System.out.println(a);
        //it overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
        //looping back within the range
        a++;
        System.out.println(a);
    }
}*/

//primitive data types in java
public class data_types{
    public static void main(String[] args) {
        // declaring a character
        char a ='G';
        //int is used for numeric values
        int  i=100;
        // use byte and short if memory is a constraint
        byte b = 4;
        //it will give an error as no is larger that the short range
        //short s1 87878787878
        //by default fraction value is double in java
        double d =4.957874;
        //for float use f as a suffix
        float f=4.695758f;

        System.out.println("char"+a);
        System.out.println("int"+i);
        System.out.println("byte"+b);
        System.out.println("double"+d);
        System.out.println("float"+f);
    }


}

