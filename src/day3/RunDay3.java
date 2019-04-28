/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author qas87
 */
public class RunDay3 {
    public static void main(String[] args) {
        Day day1 = new Day(1992,7,25);
        System.out.println(day1);
        Day day2 = new Day(2012,12,21);
        System.out.println(day2);
        Day day3 = new Day(day2);
        System.out.println(day3);
        
        System.out.println();
        
        Day d0 = new Day();
        System.out.println(d0);
        Day d1 = new Day(1992);
        System.out.println(d1);
        Day d2 = new Day(1992,7);
        System.out.println(d2);
        Day d3 = new Day(1992,7,25);
        System.out.println(d3);
        Day d4 = new Day(d0);
        System.out.println(d4);
        
        System.out.println();
        
        System.out.println(day3.getYear());
        System.out.println(day3.getMonth());
        System.out.println(day3.getDate());
        
        System.out.println();
        
        day3.setYear(1992);
        day3.setMonth(7);
        day3.setDate(25);
        System.out.println(day3);
        
        System.out.println();
        
        day3.set(2019, 4, 28);
        System.out.println(day3);
        
        System.out.println();
        
        System.out.println(day3.dayOfWeek());
        
        System.out.println();
        
        if (day1.equalTo(day2)) {
            System.out.println("相等");
        }else
            System.out.println("不相等");
    }
}
