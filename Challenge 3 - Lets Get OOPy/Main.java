class Main {
    public static void main(String[] agrs) {
        /* Available methods
         * public static void Robot(String color, int speed)
         * public void setSpeed(int newSpeed)
         * public void paint(String newColor)
         * public int getSpeed()
         * public String getColor()
     */
    
        // Create three instances of Robot
        Robot aaryan = new Robot("white", 25);
        Robot braden2 = new Robot("red", 22);
        Robot seth = new Robot("aquamarine", 500);
        Robot lucas = new Robot("grey", 501);
        
        // List all the colors of the robots
        System.out.println(aaryan.getColor());
        System.out.println(braden2.getColor());
        System.out.println(seth.getColor());
        System.out.println(lucas.getColor());

        // Paint one of the robots
        aaryan.paint("black");

        // Relist the color of the robots
        System.out.println(aaryan.getColor());
        System.out.println(braden2.getColor());
        System.out.println(seth.getColor());
        System.out.println(lucas.getColor());

        // List all the speeds of the robots

        int speed = braden2.getSpeed();
        System.out.println(speed);
        // Change the speed of one of the robots
        braden2.setSpeed(3);
        System.out.println(braden2.getSpeed());

        // Relist the speed of the robots 
    }
}