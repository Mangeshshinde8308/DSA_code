import java.util.Scanner;

public class App {

    public static void numSum(int i, int n, int sum){
        

        //base code
        if(i==n){
            sum+=i;
            System.out.println("sum of series till "+n+" ="+sum);
            return;
        }


        sum +=i;

        //recursion==function calling itself from inside function is recuresion
        numSum(i+1, n, sum);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num");
        int n=sc.nextInt();
        numSum(0, n, 0);
    }
}
