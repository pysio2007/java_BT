public class TestChar {
    public static void main(String[] args) {
        //测试char
        char c1 = 'A';
        char c2 = '高';
        System.out.print(c1);
        System.out.print(c2);    //print 不会换行，因此这里两行的输出为 A高

        /*

        转义符        含义          Unicode值
        \b           退格         \u0008
        \n           换行         \u000a
        \r           回车         \u000d
        \t           制表符（tab   \u0009
        \"           双引号        \u0022
        \'           单引号        \u0027
        \\           反斜杠        \u005c

         */
        char c3 = '\n';    //表示换行
        char c4 = '\'';    //b表示输出单引号
        System.out.print(c3);
        System.out.print(c2);
        System.out.print(c3);     //这里就可以换行了
        System.out.print(c2);   //输出就是 高 换行 高     （注释不能换行，文字代表
        System.out.print(c3);

        //字符串部署基本数据类型，是类！
        String str = "\n\n\"我\"爱你中国";
        System.out.println(str);
    }
}
