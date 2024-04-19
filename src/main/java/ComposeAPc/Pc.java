package ComposeAPc;

public class Pc {
    private String caseType;
    private String monitor;
    private String motherBoard;

    public Pc(String caseType, String monitor, String motherBoard) {
        this.caseType = caseType;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }private void drawPixel(int x,int y,String color){

    }
    private void  drawLogo(int x, int y, String color){
        drawPixel(2,3,"Red");
    }

    public void description(){
        System.out.println("“Welcome to worst buy below is the description of the pc on sale today ….”");
        System.out.println(caseType+" "+monitor+" "+motherBoard);

    }
    public void powerUp(){

    }
}
