import java.io.*;

public class StringManipulate
{

 public static void main(String args[]) throws IOException
  {
    //reads in String.
    BufferedReader stdin = new BufferedReader
    (new InputStreamReader(System.in));
    String a;

    StdOut.println ("Enter the message : ");
    System. out.flush(); // empties buffer, before you input text
    a = stdin.readLine();
    //Prints original message.
    StdOut.println("You entered =" + a + "\n");
    // counts the number of e's in the String.
    int ct = 0;
    String lower = a.toLowerCase();
    for (int i =0; i<lower.length(); i++)
      {
        if ('e' == lower.charAt(i)) ct++;}
    StdOut.println("The count for the letter e=" + ct + "\n");
    // to convert the string to uppercase.
    String upper = a.toUpperCase();

    // prints reverse order String and comparison.

    StdOut.println(new StringBuilder(a).reverse().toString() + "\n");

    // prints original String changed to Uppercase.
    StdOut.println("Changed to Uppercase = " + upper + "\n");
  }
}
