package edu.handong.csee.java.lab04.instargramChannel;

/**
 * This class represents a post in the Instagram channel.
 * It extends the InstargramChannel class to inherit basic properties.
 */
public class Post extends InstargramChannel {
    private String title;           // The title of the post.
    private boolean advertising;    // A flag indicating if the post is advertising.
    private String uploadtime;      // The upload time of the post.

    /**
     * Gets the title of the post.
     * @return The title of the post.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the post.
     * @param title The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Checks if the post is advertising.
     * @return true if the post is advertising, false otherwise.
     */
    public boolean isAdvertising() {
        return advertising;
    }

    /**
     * Sets whether the post is advertising or not.
     * @param advertising true if the post is advertising, false otherwise.
     */
    public void setAdvertising(boolean advertising) {
        this.advertising = advertising;
    }

    /**
     * Gets the upload time of the post.
     * @return The upload time of the post.
     */
    public String getUploadtime() {
        return uploadtime;
    }

    /**
     * Sets the upload time of the post.
     * @param uploadtime The upload time to set.
     */
    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime;
    }

    /**
     * Sets the title of the post.
     */
    public void settitle() {
        System.out.println("settitle() method called");
    }

    /**
     * Gets the title of the post.
     * @return The title of the post.
     */
    public String gettitle() {
        System.out.println("gettitle() method called");
        return title;
    }

    /**
     * Checks if the post is advertising.
     * @return true if the post is advertising, false otherwise.
     */
    public boolean checkadvertising() {
        return advertising;
    }

    /**
     * Sets the upload time of the post.
     */
    public void setuploadtime() {
        System.out.println("setuploadtime() method called");
    }
}
