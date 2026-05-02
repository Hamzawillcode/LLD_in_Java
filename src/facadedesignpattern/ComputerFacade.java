package facadedesignpattern;

public class ComputerFacade {
    BIOS b=new BIOS();
    CoolingSystem cs=new CoolingSystem();
    CPU cpu=new CPU();
    PowerSuppply ps=new PowerSuppply();
    public void startComputer(){
        System.out.println("----- Starting Computer -----");
        ps.providepower();
        b.boot(cpu,cs);
        System.out.println("Computer Booted Successfully!");

    }
}
