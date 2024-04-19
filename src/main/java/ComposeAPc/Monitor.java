package ComposeAPc;

public class Monitor {
    private String model;
    private int modelNumber;

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color "+ color);
    }
}
