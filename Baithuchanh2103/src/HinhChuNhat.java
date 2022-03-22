import java.util.Scanner

public class HinhChuNhat(){
        float dai;
        float rong;
        float cv;
        float dt;

    
        public void nhapchieudai() {
            System.out.println("Hãy nhập vào chieu dai: ");
            Scanner sc = new Scanner(System.in);
            dai = sc.nextFloat();
        }
        
        public void nhapchieurong() {
            System.out.println("Hãy nhập vào chieu rong: ");
            Scanner sc = new Scanner(System.in);
            rong = sc.nextFloat();
        }

        public void tinhChuvi
        () {
            cv = 2 * (dai + rong);
        }

        public void tinhDienTich() {
            dt = dai*rong;
        }

        public void inChuvi() {

            System.out.println("Chu vi hinh chu nhat : " + cv);
        }

        public void inDientich() {

            System.out.println("Dien tích Hình chu nhat: " + dt);
        }
    }
}