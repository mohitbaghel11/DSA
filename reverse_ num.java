import java.util.*;

class   reverse_num {

public static void main(String mohit[]){

    Scanner sc = new Scanner(System.in);
        
    int n = sc.nextInt();
    int rem = 0;
    int result = 0;
    
    while(n != 0){ // num 1
        rem = n%10;// 1 % 10 = 1
        result = result * 10 + rem; // 32 = 32*10 +1 = 321
            n = n/10; // 0
    }

    System.out.println(result);
}

// public int reverse(int x) {

  
    
//     return result;

// }
}
