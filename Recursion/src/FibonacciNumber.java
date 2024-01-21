import java.util.Scanner;

public class FibonacciNumber {

    public static int fib(int n){
        if(n <= 1){
            return n;
        }else{
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = in.nextInt();
        for(int i = 0;i<=n;i++){
            System.out.print(fib(i) + " ");
        }
    }
}
