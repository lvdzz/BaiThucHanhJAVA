import java.util.Scanner;
import static java.lang.System.*;

public class Bai11 {
    public static void main(String[] args) {
        int a,b,c;
        for(a=0;a<=20;a++)
            for(b=0;b<=10;b++)
                for(c=0;c<=4;c++)
                    if(a*10000+b*20000+c*50000==200000)
                        out.println(+a+" tờ 10000 "+b+" tờ 20000 "+ c+" tờ 50000");
