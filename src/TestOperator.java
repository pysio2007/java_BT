public class TestOperator {
    public static void main(String[] args) {
        System.out.println("=====算数运算符=====");
        int a = 3;
        int b = 4;
        int c = a+b*4;      //运算顺序和正常数学保持一致
        System.out.println(c);
        int d =15/4;
        System.out.println(d);  //这里会干掉小数部分，只显示整数
        int d2 = 5%2;
        System.out.println(d2);        //这里只显示余数

        a = 10;
        b = a++;         //先赋值，后自增
        System.out.println(b);  //输出10
        System.out.println(a);  //输出11
        a =10;
        b = ++a; //先自增，后赋值
        System.out.println(b);   //输出11
        System.out.println(a);   //输出11


        System.out.println("=====扩展运算符=====");
        a = 20;
        b = 30;
        a += b;      //这个算式等同于a = a+b
        System.out.println(a);
        System.out.println(b);

        System.out.println("=====关系运算符=====");
        a =20 ;
        b =30 ;
        boolean result = a<b;
        System.out.println(result);    //关系运算符返回的是布尔值


        System.out.println("=====逻辑运算符=====");
        boolean b1 = true & false;      //false
        boolean b2 = true | true;       //true
        boolean b3 = !b2;               //false
        boolean b4 = true^true;         //false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);



        //短路与，短路或
        //int w = 3/0
        //boolean b5 = 3<4 | (4<4/0);        这样就会报错
        boolean b5 = 3<4 || (4<4/0);
        System.out.println(b5);



        System.out.println("=====位运算符=====");
        int m =3;
        int n =7;
        int p1 =m&n;
        int p2 =m|n;
        int p3 =m^n;      //^是异或的意思，不是幂运算！
        int p4 =~m;         //按位取反
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        int m2 =3<<3;   //3*2*2*2
        int m3 = 12>>2;   //12/2/2
        System.out.println(m2);
        System.out.println(m3);



        System.out.println("=====字符串连接符=====");
        int r1 =3;
        int r2 =4;
        System.out.println(r1+r2);
        System.out.println("结果是"+r1+r2);


        System.out.println("=====条件运算符=====");
        int y1 =30;
        int y2 = 40;
        int minY = y1<y2?y1 : y2; //总是返回较小的值
        System.out.println(minY);


    }
}
