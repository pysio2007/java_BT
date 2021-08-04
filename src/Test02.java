import java.math.BigDecimal;

/* 类型    占用储存空间         表数范围
   byte   1字节               -2^(7) ~ 2^(7) -1 (-128~127)
   short  2字节               -2^(15) ~ 2^(15) -1 (-32768~32767)
   int    4字节               -2^(31) ~ 2^(31) -1 (-214748648~214748647)约21亿
   long   8字节               -2^(63) ~ 2^(62)-1 (-9,223,372,036,854,775,808~9,223,372,036,854,775,807)
   float  4字节               -3.403E28 ~ 3.403E38
   double 8字节               1.798E308~1.798E308


   单位换算
   1B = 8 bit
   1KB = 1024 B
   1MB = 1024*1024 B = 1024 KB
   1GB = 1024 MB
   1TB =1024 GB
   1PB =1024 TB

 */
public class Test02 {
    public static void main(String[] args) {
        byte age = 18;
        short salary =25000;
        int salary2 = 50000;
        int beijingPopulation = 30000000;
        //int globalPopulation = 7000000000; 10亿超过了int可以表达的最大数
        long globalPopulation = 7000000000L; //使用long类型可以解决本问题，但是数字后要加L
        //byte age2 =140; //整型常量超过byte范围则不能自动转型到int，后面会详细讲解


        //关于进制
        int t1 =65;  //十进制
        int t2 =065; //八进制
        int t3 =0X65; //十六进制
        int t4 =0b01000001; //二进制

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);



        //浮点数
        double dl =3.14;
        float fl =3.14F;    //浮点常量默认double。改成float需要在数字结尾加F

        double d2 = 314E-2; //科学计数法，314*10^(-2)
        System.out.println(d2);

        //浮点数是不精确的，用于比较要小心
        //如果要精确运算，要使用BigDecimal类，后续会详细讲解
        float f3 =0.1F;
        double d3 =0.1;
        System.out.println(f3==d3);    //注意，这里的输出是false 不等于


    }
}
