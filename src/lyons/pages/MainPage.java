package lyons.pages;

import java.util.Scanner;

public class MainPage extends BasePage{
    public static void main(String[] args){
        mainPage();   
    }
    
    private static void mainPage(){
        do {
            println("********************************");
            println("          1.商品维护");
            println("          2.前台收银");
            println("          3.商品管理");
            println("********************************");
            println("请选择，输入数字或者按0退出");

            switch (scanln()){
                case "0":
                    do {
                        println("确认退出？ y/n");
                        switch (scanln()){
                            case "y":
                                println("退出！");
                                return;
                            case "n":
                                println("取消");
                                mainPage();//返回了上一级 页面
                                break;
                            default:
                                break;
                        }
                    }while (true);
                case "1":
                    println("1");
                    break;
                case "2":
                    println("2");
                    break;
                default:
                    break;
            }
        }while (true);
    }

}