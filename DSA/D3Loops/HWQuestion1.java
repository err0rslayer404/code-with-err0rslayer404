package D3Loops;

import java.util.Scanner;

//Print yashika n times. take n input from user.
public class HWQuestion1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Yashika");
        }
    }
}
