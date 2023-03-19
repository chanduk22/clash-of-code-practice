/* Given the year, print the number of days in February in the year. In addition, print the type of year. The type of year is determined using the following rule:

*If the year value is divisible by 400, its type is L.
*If the year value isn't divisible by 400 but is divisible by 100, its type is H.
*If the year value isn't divisible by 100 but is divisible by 4, its type is F.
*If the year value isn't divisible by 4, its type is N.
Input
Line 1: One line that has one integer, year.
Output
Line 1: The number of days in February in year and the type of the year as described in the in Statement. Separate the two values by space.
Constraints
0 < year < 10000
Example
Input
3003
Output
28 N */


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Leap {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        if(y%400==0)
        {
            System.out.println("29"+" "+"L");
        }
        else if(y%400!=0 && y%100==0)
        {
            System.out.println("28"+" "+"H");
        }
        else if(y%100!=0 && y%4==0)
        {
            System.out.println("29"+" "+"F");
        }
        else
        {
            System.out.println("28"+" "+"N");
        }
    }
}
