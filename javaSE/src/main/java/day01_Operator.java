import org.junit.Test;

import java.util.Scanner;


public class day01_Operator {
    @Test
public void Test(){
        int k=3;
        int p=5;
        int rs=k++ + ++k - --p + p-- - k-- + ++p +2;
        System.out.println(k);
        System.out.println(p);
        System.out.println(rs);
    }
@Test
public void test(){
     int k = 30;
     int l = 40;
     int m = 35;
     int temp;
     temp=k > l ? k : l;
    System.out.println(temp > m ? temp :m);

}


@Test
public void input(){
        //new一个键盘输入对象，
    Scanner sc = new Scanner(System.in);
    //调用对象功能，等待输入
    System.out.println("input age");
    int age = sc.nextInt();
    System.out.println("input name");
    String name = sc.next();
    System.out.println(name +age);
}
@Test
public void mountain(){
     double paper=0.1;
     int count=0;
     while (paper<8848860){
         paper*=2;
         count++;
     }
    System.out.println(count);
    System.out.println(paper);
}
}
