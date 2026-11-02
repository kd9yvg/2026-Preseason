class MainSolution {
    public static void main(String[] agrs) {
        // Step 1 - Create variable for userName, userPassword, and enteredPassword
        String userName = "queenE";
        String userPassword = "iLoVePithON";
        String enteredPassword = "iLoveJAVA";

        // Step 2 - Check if the userName is correct and if userPassword and 
        // enteredPassword are the same. If the match, print "Acess Granted",
        // otherwise tell them to try again/

        if (userName.equals("queenE")) {
            if (userPassword.equals(enteredPassword)) {
                System.out.println("Acess Granted.");
            } else {
                System.out.println("Incorect password. Please try again.");
            }
        } else {
            System.out.println("User not found. Please try again.");
        }
    }
}