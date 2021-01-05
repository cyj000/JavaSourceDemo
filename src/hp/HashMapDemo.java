package hp;

import java.util.HashMap;

/**
 * @ProjectName: JavaSourceDemo
 * @ClassName: HashMapDemo
 * @Author: CYJ
 * @Date: 2021-01-04 14:47:52
 */
public class HashMapDemo {
    static HashMap<String,String> hashMap=new HashMap<>();
    public static void getHashMap(){
        hashMap.put("2","3");
        String value=hashMap.get("2");
        String oldValue=hashMap.put("2","4");
        oldValue=hashMap.remove("2");

        System.out.println(1123&11212);

    }

    public static void main(String[] args) {
        getHashMap();
    }
}
