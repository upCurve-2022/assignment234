import java.util.Scanner;
public class question19 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int n = s.nextInt();
        if (n <= 0) {
            System.out.print("Input a correct number.");
        }
        int flag = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
                flag = 1;
                break;
            }
        }
        if (flag==0)
            System.out.print("It is an ugly number.");
        System.out.print("\n");
    }
}