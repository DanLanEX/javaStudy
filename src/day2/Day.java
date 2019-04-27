/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author qas87
 */
public class Day {
    private int year;
    private int month;
    private int date;
    
    //构造函数
    public Day(){ set(1,1,1); }
    public Day(int year){ set(year,1,1); }
    public Day(int year, int month){ set(year,month,1); }
    public Day(int year, int month, int date){ set( year,month,date); }
    public Day(Day d){ set( d.year, d.month, d.date); }
    
    //获取年月日
    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDate(){return date;}
    
    //设置年月日
    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}
    public void setDate(int date){this.date = date;}
    
    public void set(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }
    
    //计算星期
    public int dayOfWeek(){
        int y = year;
        int m = month;
        if (m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
    
    //与日期d相等吗
    public boolean equalTo(Day d){
        return year == d.year &&
               month == d.month &&
               date == d.date;
    }
    
    //返回字符串表示
    public String toString(){
        String[] wd = {"日","一","二","三","四","五","六"};
        return String.format("%04d年%02d月%02d日(%s)", year,month,date,wd[dayOfWeek()]);
    }
}
