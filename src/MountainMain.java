import java.util.*;

public class MountainMain {

       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ask user to enter length of list
        System.out.print("Enter the length of list: ");
        int listLength = scanner.nextInt();

        //Getting the input for the list
        ArrayList<Mountain> values = new ArrayList<Mountain>();
        for (int x = 0; x < listLength; x++) {
            System.out.print("Enter value for list at index "+x+": " );
            int val1 = scanner.nextInt();
            values.add(new Mountain(val1));

        }

        values.forEach(val ->{
            System.out.println(val.getValue());
        });

       //Finding the highest peak
       Mountain highPeak = values.stream()
               .max((peak1, peak2) -> peak1.getValue() > peak2.getValue() ? 1 : -1).get();
       System.out.println("The highest peak is: "+highPeak.getValue());

       //Finding the lowest valley
       Mountain lowestValley = values.stream()
               .max((valley1, valley2) -> valley1.getValue() < valley2.getValue() ? 1 : -1).get();
       System.out.println("The lowest valley is: "+lowestValley.getValue());

       //Different between highest peak and lowest valley
        int diffValue = highPeak.getValue() - lowestValley.getValue();
        System.out.println("Different between highest peak and lowest valley is: "+diffValue);

        //i cant find any table
}}
