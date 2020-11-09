public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 1;
    final int FAST = 1;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }

    @Override
    public String toString() {
        if(on == true) {
            return "Fan{" +
                    ", speed=" + speed +
                    ", Fan is On" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else{
            return "Fan{" +
                    ", speed=" + speed +
                    ", Fan is Off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public double getRadius() {
        return radius;
    }
    public boolean getOn(){
        return on;
    }
    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        if(speed == FAST){
            this.speed = 3;
        }else if(speed == MEDIUM){
            this.speed = 2;
        }else if(speed == SLOW){
            this.speed = 1;
        }else{
            return;
        }
    }
}
