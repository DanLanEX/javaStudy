/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car2;
import day3.Day;
/**
 *
 * @author qas87
 */
public class CarTester1 {
    public static void main(String[] args) {
        Day x = new Day(2010,10,1);
        Car tesla = new Car("m1",x);
        
        Day p = tesla.getPurchaseDay();
        System.out.println("购买日期是：" + p);
        
        p.set(1999,12,31);
        
        Day q = tesla.getPurchaseDay();
        System.out.println("购买日期是：" + q);
    }
}
