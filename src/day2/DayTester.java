/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author qas87
 */
public class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("请输入day1");
        System.out.print("年：");           int y = stdIn.nextInt();
        System.out.print("月：");           int m = stdIn.nextInt();
        System.out.print("日：");           int d = stdIn.nextInt();
        
        Day day1 = new Day(y,m,d);
        System.out.println("day1 = " + day1);
        
        Day day2 = new Day(day1);
        System.out.println("创建了与day1的日期相同的day2");
        System.out.println("day2 = " + day2);
        
        if (day1.equalTo(day2)) {
            System.out.println("day1与day2相等");
        }else
            System.out.println("day1与day2不相等");
        
        Day d1 = new Day();
        Day d2 = new Day(1992);
        Day d3 = new Day(1992,7);
        Day d4 = new Day(1992,7,25);
        
        System.out.println("d1 =" + d1);
        System.out.println("d2 =" + d2);
        System.out.println("d3 =" + d3);
        System.out.println("d4 =" + d4);
        
        Day[] a = new Day[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day();
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
