import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class jsonTest {
    @Test
    public void print(){
        String stu_str="{'no': '001', 'name': '张三', 'age':18}";
        JSONObject stu_obj = JSON.parseObject(stu_str);
        stu_obj.put("sex","male");
        System.out.println(stu_obj);
    }

    @Test
    public void ArrayPrint(){
        String class_str="{'cname': '高一三班', 'students':[{'no':'001','name':'张三'},{'no': '002', 'name': '李四'}]}";
        JSONObject class_obj = JSON.parseObject(class_str);
        String student = class_obj.getString("students");
        JSONArray objects = JSON.parseArray(student);
        for (int i = 0; i < objects.size(); i++) {
            JSONObject stu_obj = objects.getJSONObject(i);
            System.out.println(stu_obj.get("name"));

        }

    }
}
