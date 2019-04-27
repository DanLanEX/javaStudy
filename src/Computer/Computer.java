package Computer;

public class Computer {
    private String name;
    private String cpu;
    private String gpu;
    private int ram;
    private int rom;
    
    Computer(String name, String cpu, String gpu, int ram, int rom){
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
    }
    
    void getInfo(){
        System.out.println("计算机名称是：" + name);
        System.out.println("CPU：" + cpu);
        System.out.println("GPU：" + gpu);
        System.out.println("RAM：" + ram+ "GB");
        System.out.println("ROM：" + rom+ "GB");
    }
}