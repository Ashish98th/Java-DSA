package STRING;
import java.lang.String;
public class mETHODS {
    public static void main(String[] args) {
        String name="ASHISH";
        //3)toLowerCase
       // String name3 = name.toLowerCase();
       // System.out.println(name3);

      //5)substring(start)
       // String name5 = name.substring(1);
       // System.out.println(name5);

        //6)substring(start,end)
      //  String name6=name.substring(1,6);
       // System.out.println(name6);

        //7)replace('ch1','ch2')
       // String name7=name.replace('S','P');
        //System.out.println(name7);

        //8)startsWith('ch')

//        boolean name8=name.startsWith("AS");
//        System.out.println(name.startsWith("ASH"));
    //    System.out.println(name8);

        //10)charAt(3)-->I
        //char name10=name.charAt(3);
        //System.out.println(name10);

        //15)equals

        //boolean name15=name.equals("ASHISH");
        //System.out.println(name15);
       // boolean name151=name.equals("Ashish");
        //System.out.println(name151);

        //16)equalsIgnoreCase
        boolean name16=name.equalsIgnoreCase("Ashish");
        System.out.println(name16);
    }
}
