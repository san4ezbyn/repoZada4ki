
package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main ( String[] args ) throws IOException {
File       file = new File ("text.txt");
FileWriter fw   = new FileWriter (file);


    fw.write("This is TEXT to be written in our file-1 )).\n");
    fw.close();



    File           file2 = new File ("text2.txt");
    BufferedWriter fw2   = new BufferedWriter (new FileWriter (file2 ));
    fw2.write ("Another text added to a new file #2.\n");
    fw2.close();




BufferedReader br = new BufferedReader (new FileReader (file));
       for (;;){
    String line = br.readLine();
    if (line == null)
        break;
    System.out.println (line);

}
        BufferedReader br2 = new BufferedReader (new FileReader (file2));
        for (;;){
            String line = br2.readLine();
            if (line == null)
                break;
            System.out.println (line);

        }

        br.close();

    String str = new String ( "Это бяка. Она живет в городе бяка. Ей, бяка, от роду лет. Похоже, что она та еще бяка." );

        System.out.println(str.replaceAll("бяка","ЦЕНЗУРА!!!"));


        Scanner scan = new Scanner ( System.in );
        System.out.println ( "\nTry a guess and type any digital:" );


        while (scan.hasNextInt ()) {


            double randomNumber = Math.round ( Math.random () * 3 );

            int input = scan.nextInt ();
            if (Math.round ( randomNumber ) == input) {
                System.out.print ( " U have WON. VICTORY!!" );
            }

            else {
                System.out.println ( "U have Entered " + input );

                System.out.print ( "Try another guess, please. Random digit is " + randomNumber );

            }


        }
    }

}



