//Khai báo HashMap
//thì import gói thư viện java.util.HashMap
import java.util.HashMap;
public class App78 {
    public static void main(String[] args) {
        //Khai báo 1 HashMap tên hashMap1
        // mỗi phần tử trong hashMap1 bao gồm 2 phần
        //key (Integer) và value (Float)
        HashMap<Integer, Float> hashMap = new HashMap<>();

        //Khai báo 1 HashMap tên HashMap2
        // key (String) và value (String)
        // mỗi phần tử trong hashMap2 bao gồm 2 phần 
        // có kích thước khởi tạo = 10

        HashMap<String, String> hashMap2 = new HashMap<> (10);
        
        // khai báo 1 HashMap có kích thước khởi tạo = 4 
        // và yếu tố tải = 0.75f (mặc định)
        // chi tiết về kích thước khởi tạo và yếu tố tải
        // các bạn xem lại bài HashSet

        HashMap<Double, Double> hashMap3= new HashMap<> (4, 0.75f);

        // khai báo 1 HashMap được tạo thành từ 1 Collection khác 
        
        HashMap<Float, Integer> hashMap4 = new HashMap<> (new HashMap<>());
            }
        }
