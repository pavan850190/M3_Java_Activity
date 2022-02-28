/* day 1 code of cricket match*/

import java.util.*;
import java.io.*;
import java.util.Scanner;


public class day1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String x = sc.nextLine();
        System.out.println("Enter session:\r");
        String y=sc.nextLine();
        String a= " to win";
        System.out.println("Enter runs:\r");
        int z=sc.nextInt();
        if(y.equals("First") || y.equals("first"))
        {
            ++z;
            System.out.println("Name:" + x);
            System.out.println("Scored:" + y);
            System.out.println("Need " + z + a);
        }
       else if(y.equals("second") || y.equals("Second")){
           System.out.println("Name:" + x);
           System.out.println("Scored:" + y);
           System.out.println("Matched Ended.");
       }
       else{
        System.out.println("Invalid Input.");
       }
    }

}
