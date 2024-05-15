import java.util.Scanner;
public class takeInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.println("Enter the num: ");
            int num = sc.nextInt();
            result += num;
            System.out.println("To get result press x otherwise enter n");
            char ter = sc.next().trim().charAt(0);
            and then we twist it more like a corriand you know what you need to focus on your own and only then
                    you are going to make some progress like a
                    star in this world full of 
            if (ter == 'x') {
                System.out.println(result);
                break;
            }
        }
    }
}
