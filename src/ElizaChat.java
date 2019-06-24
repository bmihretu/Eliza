import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class ElizaChat {
    private static Scanner scan = new Scanner(System.in);
    private static String usrInput;

    public static void main(String[]args){
        {
            System.out.println("Good day");
        while(true) {
            System.out.println("what is the problem?");
            usrInput=scan.nextLine();

            if(usrInput .equalsIgnoreCase("Q") || usrInput.equalsIgnoreCase("I am feeling great!")) {

                break;
            }
            response2();
            response();

        }
    }
        System.out.println("goodbye");
        String hash="";


    }//end main
    private static void response(){
        usrInput = usrInput.toLowerCase(); // dan & bk it wasn't recognizing "My" or "Me!"- Java is case sensitive and "!" wasn't split
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("i" ,"you");
        map.put("me","you");
        map.put("my", "your");
        map.put("am", "are");



        for (String retval : usrInput.split(" ")) { // [my, teacher, hates, me]



            if (map.containsKey(retval)) {

                System.out.print(map.get(retval) + " ");
            } else {
                System.out.print(retval + " ");
            }
        }
    }
    private static void response2 (){
       Random rand = new Random();
        int hedges = rand.nextInt(6)+1;
       switch (hedges) {
           case 1:
               System.out.print("Please tell me more " );
               break;
           case 2:
               System.out.print("Many of my patients tell me the same thing. " );
               break;
           case 3:
               System.out.print("It is getting late, maybe we had better quit. " );
               break;
           case 4:
               System.out.print("Why do you say that? ");
               break;
           case 5:
               System.out.print("You seem to think that, ");
               break;
           case 6:
               System.out.print("So, you are concerned that, ");
               break;
       }

    }
}//end class





