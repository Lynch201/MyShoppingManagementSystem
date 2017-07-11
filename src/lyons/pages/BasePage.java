package lyons.pages;

import java.util.Scanner;

/**
 * 页面基类
 *
 * Created by K on 2017/7/11.
 */
public class BasePage {

    /**
        输出一行字符串的方法
    */
    static void println(String s){
        System.out.println(s);
    }

    static String scanln(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
