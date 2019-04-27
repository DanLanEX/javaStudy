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
public class DayArrayError {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日","一","二","三","四","五","六"};
        
        System.out.print("日期个数：");
        int n = stdIn.nextInt();
        
        Day[] a = new Day[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i].set(2017, 10, 15);
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i].getYear() + "年" +
                               a[i].getMonth() + "月" +
                               a[i].getDate() + "日（" +
                               wd[a[i].dayOfWeek()] + "）");
        }
    }
}
