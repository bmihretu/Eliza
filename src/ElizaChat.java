import com.sun.glass.ui.SystemClipboard;

import java.util.Scanner;

public class ElizaChat {
    private static Scanner scan = new Scanner(System.in);
    private static String usrInput;

    public static void main(String[]args){

        do {
            System.out.println("Good,What is your problem?");
            usrInput=scan.nextLine();
            System.out.println(usrInput);

        }
        while(!usrInput.equalsIgnoreCase("I am feeling great!") && !usrInput.equalsIgnoreCase("Q"));
        System.out.println("goodbye");



    }//end main

}//end class
