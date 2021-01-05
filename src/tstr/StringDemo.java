package tstr;


import utils.RunTimeUtil;

import java.util.Random;

/**
 * @ProjectName: JavaSourceDemo
 * @ClassName: StringDemo
 * @Author: CYJ
 * @Date: 2021-01-04 11:40:15
 */

/*String 的构成方式是final 字符数组。
* 使用final的原因：
*   只有字符串不可更改的时候，才能实现字符串常量池。用来缓存字符串，提高程序的运行效率
*   使用final保证String的值不可被更改，避免在调用一些系统的操作指令集的时候意外的改变了String的值
* 缺点：拼接字符串的时候，会消耗更多资源。使用StringBuilder或者StringBuffer来操作字符串
* 其中StringBuffer使用了synchronized修饰，以便于在并发环境下使用，但是这样会使效率降低。于是出现了StringBuilder
* 常用方法 equals,compareTo
* compareTo。传入一个字符串。先获取长度，进行对比。在小的那个字符串的基础上进行字符比较。如果是字符不同，返回char1-char2.字符相通返回len1-len2

* equals。1.比较地址，2.判断是否为同一个类，3.根据每一位进行比较，4.true or false
*
*
* */

public class StringDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建String的三种方法
        String str1="java";
        //不如直接赋值方便;
        String str2=new String("java");
        char[] chars={'C','h','i','n','a'};
        //通过char数组来创建，可以选择起始位置，和结束位置
        String str3=new String(chars);
        RunTimeUtil runTimeUtil=new RunTimeUtil();
        Thread.sleep(1000);
        runTimeUtil.start();
        StringBuilder stringBuilder =new StringBuilder();
        Random random=new Random(100000);
        for (int i = 0; i < 100000; i++) {

            stringBuilder.append((char)random.nextInt());
        }
        Thread.sleep(1000);
        String str5=new String(stringBuilder);
        runTimeUtil.finish("StringBuilder");
        Thread.sleep(1000);
        runTimeUtil.start();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append((char)random.nextInt());
        }
        String str6=new String(stringBuffer);
        Thread.sleep(1000);
        runTimeUtil.finish("stringBuffer");

        System.out.println("str1 compareTo str2:"+str1.compareTo(str2));

        String str7=str2.intern();
        System.out.println("str1,str2:"+str1==str2);
        System.out.println("str1,str7:"+str1==str7);
        System.out.println("str7,str2:"+str2==str7);
        String str8="ja"+"va";
        System.out.println(str1==str8);


    }

}
