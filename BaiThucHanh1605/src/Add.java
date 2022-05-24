import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        AddSetAndMap add = new AddSetAndMap();
        add.addSet();
        add.addMap();
    }
}
class AddSetAndMap{
    private int number;
    private int key;
    private HashSet<Integer> hashSetInteger = new HashSet<>();
    private HashMap<Integer, Integer> hashMapInteger = new HashMap<>();
    public void addSet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so phan tu can them: ");
        number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            //nhập phần tử cần thêm bằng Set được nhập từ bàn phím
            int nb;
            System.out.println("phan tu thu "+i+" la: ");
            nb = scanner.nextInt();
            hashSetInteger.add(nb);
        }
        
        //hiển thị phần tử được thêm
        System.out.println("cac phan tu duoc them"+hashSetInteger);
    }

    public void addMap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so phan tu can them: ");
        number = scanner.nextInt();
        //nhập phần tử cần thêm bằng Map được nhập từ bàn phím
        for(int i = 0; i < number; i++) {
            System.out.println("nhap key trong map: ");
            key= scanner.nextInt();
            int b;
            System.out.println("nhap phan tu can them: ");
            b = scanner.nextInt();

            hashMapInteger.put(key,b);
        }
        //hien thi phan tu duoc them
        System.out.println("cac phan tu duoc them: "+hashMapInteger);
    }
}