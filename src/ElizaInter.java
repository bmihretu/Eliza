import java.util.Scanner;
import java.util.HashMap;

public class ElizaInter {
    public static void main(String []args){
    String hash="";
     HashMap<String,String> map = new HashMap<String,String>();
        map.put("I" ,"you");
        map.put("me","you");
        map.put("my", "your");
        map.put("am", "are");

//        System.out.println("map =" + map);
//        System.out.println(map.get("my"));
//        System.out.println(map.get("I"));
//        System.out.println(map.get("me"));
//        System.out.println(map.get("am"));


     String Str = new String("My Teacher Hates Me !");
     Str = Str.toLowerCase(); // dan & bk it wasn't recognizing "My" or "Me!"- Java is case sensitive and "!" wasn't split



        for (String retval: Str.split(" ")) { // [my, teacher, hates, me]
//            hash = retval;
//            System.out.println(hash);
//            System.out.println(retval);


            if (map.containsKey(retval)) {

                System.out.print(map.get(retval)+ " ");
            } else {
                System.out.print(retval + " ");
            }
        }

    }//end main
}//end class
