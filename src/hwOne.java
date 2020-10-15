import java.util.Arrays;
import java.util.Scanner;
public class hwOne {
   public static void main(String args[]){
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<size; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array ::"+sum);
   }
}

    // public static void main(String[] args) {
        
    //     int[] grades = {90, 95, 80, 68, 97};
    //     int newTotal = 0;

    //     for (int i = 0; i < 5; i++) {
    //         grades[i] += 0;
    //         grades[i] = newTotal;
    //     } 
        
    //     System.out.println(newTotal);
    
    // }
// }
