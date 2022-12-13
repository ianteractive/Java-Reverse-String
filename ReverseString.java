package basicJava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //input String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        //output reverse String per char
        System.out.println("Reverse of a String " + str + " is: ");
        for (int j = str.length(); j>0; --j){
            System.out.print(str.charAt(j-1));
        }
    }
}
