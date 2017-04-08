package jurnal;
import java.util.Scanner;

public class Jurnal {

    
    public static void main(String[] args) {
        long temp;
        Scanner sc = new Scanner (System.in);
        System.out.print ("masukkan jumlah bilangan finobacci ");
        int n=sc.nextInt ();
        long fib[] = new long[n];
        fib [0]=1;
        fib [1]=1;
        for (int i=2; i<n; i++){
            fib[i] = fib[i-1] + fib[i-2];
            
        }
        
         for (int i=n-1; i>=0 ; i--){
           system.out.print(fib[i] + " ");
         }
         
    
    }
    
}
