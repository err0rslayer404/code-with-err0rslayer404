package D2ConditionalStatements;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CP: ");
        int cp = sc.nextInt();
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();
        int profit = sp-cp;
        int loss = cp-sp;
        if (cp<sp){
            System.out.println("Profit: "+profit);
        }else if(cp>sp) {
            System.out.println("Loss: "+ loss);
        }else {
            System.out.println("No Profit No Loss");
        }
    }
}
