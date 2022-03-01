import java.util.Scanner;
import static java.lang.System.*;

public class Bai5 {
        public static void main(String[] args) {
            
            var sc = new Scanner(in);
            
            int sum = 0, a;
            System.out.println("\n\nNhập vào số cần kiểm tra: ");
            a = sc.nextInt();
            
            for(int i=1;i<=a/2;i++){
                if(a%i==0)
                    
                    sum+=i;
            }
            if(sum==a){
                System.out.println(a + " là số hoàn hảo");
            }
            else {
                System.out.println(a + " không phải là số hoàn hảo");
            }


        }
    }