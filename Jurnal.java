package jurnal;
import java.util.Scanner;

public class Jurnal {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("masukkan jumlah bilangan finobacci ");
        int n=sc.nextInt ();
        long fib[] = new long[n];
        fib [0]=1;
        fib [1]=1;
        for (int i=2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
            
        }
        
         for (int i=0; i<n; i++){
             System.out.print(fib[i] + " ");
         }
    
    }
    
}
