import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
