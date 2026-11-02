class Robot {
    String color;
    int speed;
    
    public Robot(String colorIn, int speedIn) {
        color = colorIn;
        speed = speedIn;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void paint(String newColor) {
        color = newColor;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}