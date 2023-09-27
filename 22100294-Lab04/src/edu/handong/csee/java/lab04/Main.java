package edu.handong.csee.java.lab04;

import edu.handong.csee.java.lab04.instargramChannel.InstargramChannel;
import edu.handong.csee.java.lab04.instargramChannel.Post;
import edu.handong.csee.java.lab04.instargramChannel.User;

/**
 * This class demonstrates the usage of Instagram-related classes such as InstargramChannel, Post, and User.
 * It creates instances of these classes, sets their attributes, and prints their information.
 */
public class Main {

    /**
     * The main method of the program.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        Main runner = new Main();

        runner.run();

    }

    /**
     * The method that runs the program and demonstrates the usage of Instagram-related classes.
     */
    public void run() {
        // InstagramChannel 객체 생성
        InstargramChannel myChannel = new InstargramChannel();
        myChannel.setUserID("22100294");
        myChannel.setUserName("박정규");
        myChannel.setLike(100);
        myChannel.setImgID("22100294");

        // Post 객체 생성
        Post myPost = new Post();
        myPost.setTitle("My Post Title");
        myPost.setAdvertising(false);
        myPost.setUploadtime("2023-09-19");

        // User 객체 생성
        User user = new User();
        user.setFollowers(500);
        user.setEmail("user@example.com");
        user.setPassword("mypassword");

        // InstagramChannel과 Post 객체 출력
        System.out.println("My Instagram Channel Information:");
        System.out.println("User ID: " + myChannel.getUserID());
        System.out.println("User Name: " + myChannel.getUserName());
        System.out.println("Likes: " + myChannel.getLike());
        System.out.println("Image ID: " + myChannel.getImgID());

        System.out.println("\nMy Post Information:");
        System.out.println("Title: " + myPost.getTitle());
        System.out.println("Is Advertising: " + myPost.isAdvertising());
        System.out.println("Upload Time: " + myPost.getUploadtime());

        // InstagramChannel과 Post 객체 간의 관계
        myChannel.setImgID(myPost.getUploadtime()); // 예시로 InstagramChannel의 ImgID를 Post의 업로드 시간으로 설정

        // User 객체 출력
        System.out.println("\nUser Information:");
        System.out.println("Followers: " + user.getFollowers());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
    }
}
