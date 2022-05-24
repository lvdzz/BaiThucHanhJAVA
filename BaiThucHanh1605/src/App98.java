import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
public class App98 {
    public static void main(String[] args) {

        // khai báo 1 TreeMap tên treeMap1
        
        // mỗi phần tử trong treeMap1 bao gồm 2 phần
        
        // key (String) và value (Double)
        
        TreeMap<String, Double> treeMap1 = new TreeMap<>();
        
        // khai báo 1 TreeMap được tạo thành từ 1 Map
        
        Map<Float, Integer> map = new HashMap<>(); 
        
        TreeMap<Float, Integer> treeMap2 = new TreeMap<>(map);
        
        }
}
