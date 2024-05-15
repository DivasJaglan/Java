import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();

        int arr[] = {3,1,6,4,7};
        for(int i = 0,j =2; i <=a; i++, j++){
            if(a % j == 0){
                arr[i] = j;
            }
        }
        System.out.println(arr);
    }
}
