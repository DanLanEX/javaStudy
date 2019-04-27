/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author qas87
 */
public class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日","一","二","三","四","五","六"};
        
        System.out.println("请输入阳历生日：");
        System.out.print("年：");   int y = stdIn.nextInt();
        System.out.print("月：");   int m = stdIn.nextInt();
        System.out.print("日：");   int d = stdIn.nextInt();
        
        Day birthday = new Day(y,m,d);
        
        System.out.println(
                "你的生日是"
                + birthday.getYear() + "年"
                + birthday.getMonth() + "月"
                + birthday.getDate() + "日，是星期"
                + wd[birthday.dayOfWeek()] + "。"
        );
    }
}
