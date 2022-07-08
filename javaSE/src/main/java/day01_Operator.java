import org.junit.Test;


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


}
