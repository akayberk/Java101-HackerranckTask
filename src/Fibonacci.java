import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n0=0, n1=1, nx;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kacinci sayiya kadar fibonacci sayilarina bakalim kral?");
        int n = sc.nextInt();
        System.out.print("0, 1, ");
        for (int i=2;i<=n-1;i++){
            nx=n0+n1;
            System.out.print(nx+", ");
            n0=n1;
            n1=nx;
        }
    }
}
// 0  1   1      2         3             5             8  13  21  34  55
//n0 n1 temp temp+n1  temp+temp+n1    3*temp+2*n1    5*temp+3*n1