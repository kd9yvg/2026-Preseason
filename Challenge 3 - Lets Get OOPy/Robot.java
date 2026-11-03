class Robot {
    private String color;
    private int speed;
    
    public Robot(String colorIn, int speedIn) {
        color = colorIn;
        speed = speedIn;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void paint(String newColor) {
        color = newColor; // Set the color to the new color
    }

    public String getColor() {
        return color; // Return the current color
    }

    public int getSpeed() {
        return speed; // Return the current speed
    }
}