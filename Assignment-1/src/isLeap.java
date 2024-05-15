import java.util.Scanner;

public class isLeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
//        System.out.println(java.time.Year.isLeap(year)); // Java in-built method to check if the year is leap year or not

        if((year % 100 != 0) && (year % 4 == 0) || (year % 400 ==0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }

}