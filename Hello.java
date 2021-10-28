import java.sql.SQLOutput;
import java.util.Scanner;
//Here I import the scanner so i can input my variable next.
public class Hello {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hello. What is your name? ");
            String y = scanner.next();
            System.out.print("It's nice to meet you," + y + "." + "How old are you?");
            String z = scanner.next();
            System.out.println("I see that you are still quite young at only " + z + ".");
            System.out.print("Where do you live?");
            String q = scanner.next();
            System.out.print("Wow! I've always wanted to go to "+ q + "." + "Thanks for chatting with me. Bye!");




        }

    }