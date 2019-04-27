/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

/**
 *
 * @author qas87
 */
public class Today {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        
        System.out.printf("今天是%04d年%02d月%02d日。\n",
                           today.get(YEAR),
                           today.get(MONTH) + 1,
                           today.get(DATE));
    }
}
