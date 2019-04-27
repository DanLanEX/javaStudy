/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Administrator
 */
public class ComputerRun {
    public static void main(String[] args){
        Computer apple = new Computer("Apple MacBook 12","Intel i5-6250U","NVIDIA GTX1080Ti",16,512);
        
        apple.getInfo();
    }
}
