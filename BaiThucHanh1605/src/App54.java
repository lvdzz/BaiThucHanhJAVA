import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        //thêm các phần tử vào 
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        
        //hiển thị
        System.out.println("Các phần tử trong hashSetInteger: " + hashSetInteger);
        System.out.println(hashSetInteger);
        System.out.println("nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        
        //thêm một phần tử mới vào hastSet được nhập từ bàn phím
        // nếu phần tử đó đã tồn tại thì báo là đã tồn tại và ngược lại thì thêm vào
        if(!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("thêm thành công");
            System.out.println("các phần tử trong hastSetInteger sau khi thêm: ");
            System.out.println(hashSetInteger);
        } 
        else {
            System.out.println("Phần tử "+ number +" đã tồn tại ");
        }
    }
}
