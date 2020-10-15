import java.util.ArrayList;
import java.util.Scanner;

public class hwThree {

    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("How long will your list to be? (1-100)");
            int size = s.nextInt();

            System.out.println("What power will you raise your list items to? (1-10)");
            int power = s.nextInt();

            ArrayList<Double> myList = new ArrayList<Double>(size);

            for (int i = 0; i < size; i++) {
                System.out.println(Math.pow(i, power));
            } 
       
        }
    }
