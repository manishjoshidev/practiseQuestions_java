import java.util.Scanner;
public class Solution{

    public static void Factorial(int n) {
        if(n<0){
            System.out.println("invalid number");
           return;
        }
        int fact=1;
        for(int i = n; 1 <= i; i--)
        {
           fact=fact*i;
            System.out.println(fact);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       Factorial(n);

    }

}









