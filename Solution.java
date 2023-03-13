/*write a java program for You are given a string representing a website's address. To calculate the IP address you must convert all the characters into ASCII code, then calculate the sum of the values.
Example: abc -> 97+98+99 -> 294

The first IP number will be the result mod 256. Because there is no IP number bigger than 256. The second IP number will be the double of the sum mod 256, the third will be the triple of the sum mod 256 and the fourth will be quadruple of the sum, mod 256.

This is not a real algorithm, this is only a adaptation to Clash of Code.                                                                          Input
The address of the website.
Output
Print the IP numbers, separated by dots, in the same line.
Example
Input
www.codingame.com
Output
167.78.245.156 */


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int asciiSum = 0;
        for (int i=0; i< a.length();i++) {
            asciiSum += (int)a.charAt(i);
        }
        int ip1 = asciiSum % 256;
        int ip2 = (2 * asciiSum) % 256;
        int ip3 = (3 * asciiSum) % 256;
        int ip4 = (4 * asciiSum) % 256;
        System.out.println(ip1 + "." + ip2 + "." + ip3 + "." + ip4);
    }
}
