package edu.handong.csee.java.lab04.instargramChannel;

/**
 * This class represents a user of the Instagram channel.
 * It extends the InstargramChannel class to inherit basic properties.
 */
public class User extends InstargramChannel {
    private int followers;      // The number of followers for the user.
    private boolean adult;      // A flag indicating if the user is an adult.
    private String email;       // The email address of the user.
    private String password;    // The password of the user.

    /**
     * Constructs a new User object with default values.
     */
    public User() {
        super();
    }

    /**
     * Sets the number of followers for the user.
     * @param followers The number of followers to set.
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }

    /**
     * Gets the number of followers for the user.
     * @return The number of followers.
     */
    public int getFollowers() {
        return followers;
    }

    /**
     * Checks if the user is an adult.
     * @return true if the user is an adult, false otherwise.
     */
    public boolean checkAdult() {
        return adult;
    }

    /**
     * Sets the email address of the user.
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the email address of the user.
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the password of the user.
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the password of the user.
     * @return The password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Follows another user.
     */
    public void Follow() {
        System.out.println("Follow() method called");
    }

    /**
     * Saves the ID of a post.
     */
    public void savedPostID() {
        System.out.println("savedPostID() method called");
    }
}
