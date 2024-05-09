import java.io.*;
import java.time.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Input a number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String arg = reader.readLine();
        multiples(arg);
        divisors(arg);

        System.out.println("Input your name: ");
        arg = reader.readLine();
        reverseName(arg);
        System.out.println();
        nameLength(arg);
        System.out.println();

        System.out.println("Input a number between 0 and 100: ");
        arg = reader.readLine();
        randNumTimer(arg);

        LocalDate date = LocalDate.now();
        System.out.println("Today's date is: " + date);

        System.out.println("Input a list of cars: ");
        ArrayList<String> carList = new ArrayList<String>();
        while(true) {
          arg = reader.readLine();
          carList.add(arg);
          if (carList.size() == 5) {
            break;
          }
        }
        hashSetPractice(carList);

    }

    public static void multiples(String arg) {
        int num = Integer.parseInt(arg);
        for (int i = 1; i <= num; i++) {
          int mutiply = num * i;
          System.out.println(num + " x " + i + " = " + mutiply);
          System.out.println();
      }
    }

    public static void divisors(String arg) {
      int num = Integer.parseInt(arg);
      System.out.println("Your divisors are:");
      for (int i = 1; i <= num; i++) {
        if (num % i == 0 && i != num) {
          System.out.print(i + ", ");
        } else if (num % i == 0 && i == num) {
          System.out.println(i);
        }
      }
      System.out.println();
    }

    public static void reverseName(String arg) {
        char ch, nstr = ' ';
        String name = "";
        for (int i = arg.length()-1; i >= 0; i--) {
          ch = arg.charAt(i); //extracts each character
          nstr = ch; //adds each character in front of the existing string
          name += Character.toString(nstr);
        }
        System.out.println("Your name in reverse is: " + name);
    }

    public static void nameLength(String arg) {
        if(arg.contains(" ")){
          System.out.println("Your name has length: " + (arg.length() - 1));
        } else {
          System.out.println("Your name has length: " + arg.length());
        }
      }

    public static void randNumTimer(String arg) {
      Random rand = new Random();
      int number = Integer.parseInt(arg);
      int iteration = 1;
      int random = rand.nextInt(100);
      while (random != number) {
        random = rand.nextInt(100);
        iteration = iteration + 1;
        if (iteration > 50) {
          break;
        }
      }
      if (iteration < 50) {
        System.out.printf("It took %d iterations", iteration);
        System.out.println();
      } else {
        System.out.printf("We could not match your number within 50 iterations.");
        System.out.println(); 
      }
    }

    public static void hashSetPractice(ArrayList<String> arg) {
      System.out.println(arg);
      for(int i = 0; i < arg.size(); i++) {
        if (arg.contains("Venue")) {
          arg.remove("Venue");
        }
      }
      System.out.println(arg);
    }

}