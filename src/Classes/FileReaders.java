package Classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReaders {


    public static HashMap<String, Letter> letterReader()
    {
        HashMap<String, Letter> map = new HashMap<String, Letter>();
        try {
            FileReader file = new FileReader("G:\\JAVA UNI\\Post\\letters.txt");
            Scanner fcin = new Scanner(file);


            while (fcin.hasNextLine())
            {
                String str = fcin.nextLine();
                String[] arr = str.split("\"");
                //for (String a : arrOfStr)
                  //  System.out.println(a);
                map.put(arr[5],new Letter(arr[1],arr[2],arr[3], Integer.valueOf(arr[4]),arr[5]));

            }

        }
        catch (FileNotFoundException ex) {System.out.println("Error:"+ex.getMessage());}
        return map;
    }

    public static HashMap personReader()
    {
        HashMap<String, Person> map = new HashMap<String, Person>();
        try {
            FileReader file = new FileReader("G:\\JAVA UNI\\Post\\persons.txt");
            Scanner fcin = new Scanner(file);


            while (fcin.hasNextLine())
            {
                String str = fcin.nextLine();
                String[] arr = str.split("\"");
                //for (String a : arrOfStr)
                //  System.out.println(a);
                map.put(arr[3], new Person(arr[1],arr[2],arr[3], arr[4] ,arr[5]));

            }

        }
        catch (FileNotFoundException ex) {System.out.println("Error:"+ex.getMessage());}
        return map;
    }

    public static HashMap<String, House> houseReader()
    {
        HashMap<String, House> map = new HashMap<String, House>();
        try {
            FileReader file = new FileReader("G:\\JAVA UNI\\Post\\houses.txt");
            Scanner fcin = new Scanner(file);


            while (fcin.hasNextLine())
            {
                String str = fcin.nextLine();
                String[] arr = str.split("\"");
                //for (String a : arrOfStr)
                //  System.out.println(a);
                map.put(arr[3],new House(arr[1],arr[2],arr[3], arr[4],arr[5]));

            }

        }
        catch (FileNotFoundException ex) {System.out.println("Error:"+ex.getMessage());}
        return map;

    }


    static void write(String text, String reciverpc, String senderpc, int priority, String letterid)
    {

    }
}
