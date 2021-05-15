// Author: Jose Enriquez
// Email: jose.enriquez@okstate.edu
// 4/30/2021
// Represents a User.
public class User {
    String userName;
    String userID;
    int userIDOnlyNumbers;

    /**
     * Creates a User
     * @param userName name of User
     * @param userID ID of user
     */
    public User(String userName, String userID){
        this.userName = userName;
        this.userID = userID;

        //Converts the ID into a fully numeric value.
        String letter = Integer.toString(userID.charAt(0));
        String userIdNumber = letter + userID.substring(1);
        this.userIDOnlyNumbers = Integer.parseInt(userIdNumber);
    }

    /**
     * Prints the Username and ID
     */
    @Override
    public String toString() {
        return userName + ": " + userID;
    }

    public static void main(String[] args) {
        User a1 = new User("joe", "A1234");
        System.out.println(a1.userIDOnlyNumbers);
    }
    
}
