// day 1 code of cricket match

import java.util.*;
import java.io.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class day1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name: \n");
        String x = sc.nextLine();
        System.out.println("Enter session: \n");
        String y=sc.nextLine();
        String a= " to win";
        System.out.println("Enter runs:\n");
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
/* # QUESTION
Consider you guys have to develop the Cricket match result application, based on the Innings information. The following details given
Data type   Field name
String      teamname
String      inningsname
int         runs
The requirements are the following:
To Secure the above data
To assign and access the data indirectly.
Based on the innings name the condition given below
If inningsname is “first” –  to display the result like “runs+1” to Win the match
If inningsname is “second” -  to display the result like “Match Ended”.
Any other than this “Invalid Input”.
Test it using the Main Class.

Sample Input 1:
Enter the team name:
Australia
Enter session:
First
Enter runs:
300

Sample output 1
Name: Australia
Scored: 300
Need 301 to win

Sample Input 2:
Enter the team name:
Australia
Enter session:
Second
Enter runs:
200

Sample output 2
Name: Australia
Scored: 200
Match Ended.
*/