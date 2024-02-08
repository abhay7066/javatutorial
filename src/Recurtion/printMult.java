package Recurtion;

public class printMult {
    //funvction defination
    public static void printMult(int n , int k)
    {
        if(k==1)
        {
            System.out.println(n);
            return ;
        }

        printMult( n, k-1);
        System.out.println(n*k);
    }

    //driver code
    public static void main(String[] args) {

        int n=25;
        int k = 5;
        // function calling
        printMult(n,k);
        System.out.println();

    }
}
