import java.util.*;

public class Prime_factorised{

public static void main(String[] args) {
  // write your code here  
  
  Scanner sc = new Scanner (System.in);
  int n = sc.nextInt();
  
  for(int i= 2; i*i <=n; i++){
      while(n%i == 0){
          n = n/i;
          System.out.print(i+" ");
      }
  }
  if(n != 1){
        System.out.print(n);
  }
 }
}