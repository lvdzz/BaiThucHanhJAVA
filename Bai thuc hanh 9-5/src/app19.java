import java.util.ArrayList;
import java.util.ListIterator;

public class app19{
	public static void main(String[] args){
        // khai báo1ArrayList có tên là arrlistChar
       // có kiểu là Character
        ArrayList<Character> arrlistChar=new ArrayList<>();
        arrlistChar.add('a');
        arrlistChar.add('e');
        arrlistChar.add('b');
        arrlistChar.add('c');

       // khai báo một ListIterator có kiểu là Character
        ListIterator<Character> listIterator = arrlistChar.listIterator();
        
        // hiển thị các phần tử có trong arrListChar
       // bằng cách sử dụng ListIterator
        System.out.println("Các phần tử có trong arrListChar là: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+"\t");
        }
}
}