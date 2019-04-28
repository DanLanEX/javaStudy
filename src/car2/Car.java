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
public class Car {
    private String name;
    private Day purchaseDay;
    
    //构造函数
    public Car(String name, Day purchaseDay){
        this.name = name;
        this.purchaseDay = new Day(purchaseDay);
    }
    
    public Day getPurchaseDay(){
        return new Day(purchaseDay);
    }
}
