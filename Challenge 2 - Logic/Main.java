class Main {
    public static void main(String[] agrs) {
        // Step 1 - Create variable for userName, userPassword, and enteredPassword
        String userName = "userName";
        String userPassword = "passywordy";
        String enteredPassword = "passywordy";
        // Step 2 - Check if the userName is correct and if userPassword and 
        // enteredPassword are the same. If the match, print "Acess Granted",
        // otherwise tell them to try again
        if(userPassword.equals(enteredPassword)){
            System.out.println("access granted");
        } else{
            System.out.println("try again");
        }
    }
}