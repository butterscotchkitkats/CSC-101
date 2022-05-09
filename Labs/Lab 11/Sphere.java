import java.text.DecimalFormat;

public class Sphere {
    private double radius;
    private String color;
    private boolean bouncy;
    String ifBouncy;
    DecimalFormat df = new DecimalFormat("#.##");

    public Properties() {
        radius = 0.0;
        color = "White";
        bouncy = false;
    }

    public setRadius(int newRadius) {
        radius = newRadius;
        color = "White";
        bouncy = false;
    }

    public setProperties(int newRadius, int newColor, int newBouncy) {
        radius = newRadius;
        color = newColor;
        bouncy = newBouncy;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public Boolean isBouncy(){
        return bouncy;
    }

    public void setBouncy(Boolean newBouncy){
        bouncy = newBouncy;
    }

    public String toString(){
        if (bouncy == false) {
            ifBouncy = "Non-Bouncy";
        }
        else if (bouncy == true){
            ifBouncy = "Bouncy";
        }
        
        return ifBouncy + " " + color + " sphere with a radius of " + df.format(radius);
    }

}
