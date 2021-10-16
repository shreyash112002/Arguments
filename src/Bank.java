

import java.io.IOException;
import java.util.Scanner;



    public class Bank {
        public static void main(String[] args) throws IOException
        {
            Scanner sc=new Scanner(System.in);
            char ch;
            System.out.println("Enter Gender"); //M/F
            ch=(char) System.in.read();
            System.out.println(ch);
            System.out.println("Enter your name");
            String name;
            name=sc.next();
            System.out.println("Your name is"+name);
            int acc;

            System.out.println("Enter your account balance");
            acc=sc.nextInt();
            System.out.println("Balance is"+acc);


        }
    }


