package facadedesignpattern;

public class BIOS {
    public void boot(CPU cpu,CoolingSystem cs) {
        System.out.println("BIOS: Booting CPU and fan checks...");
        cpu.initialize();
       cs.startFans();
    }
}
