import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
//随机数
    @Test
    public void random(){
        //创建随机数对象
        for (int i=0 ;i<=10;i++) {
            Random random = new Random();
            int data = random.nextInt(10);
        }
    }
    //静态数组代码
    @Test
    public void Array(){
        //简化版
        double[] scores = {98.5, 75.2, 77.4};
        //默认静态素组
        int[] age = new int[]{18, 19, 22,15,35};
        String[] name={"老王","老李","老赵"};
        //取值
        System.out.println(age[2]);
        //长度
        //索引为长度-1
        System.out.println(age.length);
        System.out.println("------------------");
        //foreach循环遍历数组
        for (int ages: age) {
            System.out.println(ages);
        }
        System.out.println("------------------");
        //用长度遍历
        for (int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }
    }
    //例题数组求和
    @Test
    public void sum(){
        int[] money={16,26,36,6,100};
        int count=0;
        for (int i=0;i<money.length;i++) {
            count+=money[i];
        }
        System.out.println(count);
    }

    //数组元素求最值
    @Test
    public void faceScore(){
        int[] facescore={15,90,95,88,17,-5};
        int stable=facescore[0];
        for (int i = 0; i < facescore.length; i++) {
            if (facescore[i]>stable){
                stable=facescore[i];
            }
        }
        System.out.println(stable);
    }
    //动态数组
    @Test
    public void dynamicArray(){
        List<Integer> random = new ArrayList<Integer>();
        Random random1 = new Random();

        for (int i = 0; i < 5; i++) {
            int x = random1.nextInt(1,20);
            random.add(x);
        }
        System.out.println(random);
        //求最大
        Integer max= random.get(0);
        for (Integer integer : random) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println(max);
    }
    @Test
    public void pop(){
        int [] a={12,77,5,4,65,25};
        //分析循环了几轮遍历（a.length-1次循环）
        //外层：注意定义的循环次数要准确
        for (int i = 1; i <= a.length-1; i++) {
            //内层
            for (int j = 0; j < a.length-i; j++) {
                int temp=a[j+1];
                if (a[j]>a[j+1]){
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //内存new是堆内存
    //方法是栈内存


    //求质数
    @Test
    public void sigleNumber(){
        for (int i = 101; i <=200; i++) {
            //寻找100-200的质数
            boolean flag=true;//要求找一个信息位置判定是否为质数（默认为质数
            for (int j = 2; j <i/2; j++) {
                if (i%j==0){
                    flag=false;
                    break;//不是质数跳出当前循环
                }
            }
            if (flag){//是的话输出
                System.out.println(i);
            }
        }
    }
}
