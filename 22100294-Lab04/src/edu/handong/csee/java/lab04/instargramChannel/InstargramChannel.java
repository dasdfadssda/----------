package edu.handong.csee.java.lab04.instargramChannel;

/**
 * This class represents an Instagram channel with basic information.
 * It provides methods to get and set user-related data and perform actions related to the channel.
 */
public class InstargramChannel {
    private String userID;      // The user's ID.
    private String userName;    // The user's name.
    private String imgID;       // The image ID associated with the channel.
    private int like;           // The number of likes for the channel.
    private String channelID;   // The channel's ID.

    /**
     * Gets the user's ID.
     * @return The user's ID.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Gets the user's name.
     * @return The user's name.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets the image ID associated with the channel.
     * @return The image ID.
     */
    public String getImgID() {
        return imgID;
    }

    /**
     * Gets the number of likes for the channel.
     * @return The number of likes.
     */
    public int getLike() {
        return like;
    }

    /**
     * Sets the user's ID.
     * @param userID The user's ID to set.
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Sets the user's name.
     * @param userName The user's name to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets the number of likes for the channel.
     * @param like The number of likes to set.
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * Sets the user's ID.
     * @param userID The user's ID to set.
     */
    public void setuserID(String userID) {
        this.userID = userID;
    }

    /**
     * Sets the user's name.
     * @param userName The user's name to set.
     */
    public void setuserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets the image ID associated with the channel.
     * @param imgID The image ID to set.
     */
    public void setImgID(String imgID) {
        this.imgID = imgID;
    }

    /**
     * Gets the number of likes for the channel.
     * @return The number of likes.
     */
    public int getlike() {
        return like;
    }

    /**
     * Searches for a user's ID.
     * @return The searched user's ID.
     */
    public String searchuserID() {
        // Add the logic to search for the user's ID here.
        return "Searched userID";
    }

    /**
     * Searches for a channel's ID.
     * @return The searched channel's ID.
     */
    public String searchChannelID() {
        // Add the logic to search for the channel's ID here.
        return "Searched channelID";
    }

    /**
     * Uploads an image to the channel.
     * @return The uploaded image's ID.
     */
    public String uploadImg() {
        // Add the logic to upload an image here.
        return "Uploaded image ID";
    }

    /**
     * Follows a channel.
     * @return The result of following the channel.
     */
    public String ForrowChannel() {
        // Add the logic to follow a channel here.
        return "Channel follow result";
    }

    /**
     * Makes algorithms for the channel.
     * @return The created algorithms.
     */
    public String makeAlgorithms() {
        // Add the logic to create algorithms here.
        return "Created algorithms";
    }
}
