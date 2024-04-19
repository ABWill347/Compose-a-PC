package ComposeAPc;

public class MotherBoard {
   private String model;
   private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadProgram(String program,String programName){
        programName= " programName is now running.";
        System.out.println(program+programName);

    }
}
