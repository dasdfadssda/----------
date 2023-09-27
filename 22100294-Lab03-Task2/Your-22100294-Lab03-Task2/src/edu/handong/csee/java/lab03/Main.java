package edu.handong.csee.java.lab03;

import edu.handong.csee.java.lab03.user.MySelf; // MySelf -> Myself로 수정
import edu.handong.csee.java.lab03.gift.Gift;
import edu.handong.csee.java.lab03.user.Friend;

public class Main {

    public static void main(String[] args) {

        Main runner = new Main();

        runner.run();

    }

    public void run() {

        MySelf jc = new MySelf(); // MySelf -> Myself로 수정
        jc.setName("JC Nam");
        System.out.println("Me: " + jc.getName());

        Friend jh = new Friend();
        jh.setName("JH Park");
        System.out.println("Friend: " + jh.getName());

        jh.setIsFavorite(true);

        Gift myGiftToJH = new Gift();
        Gift myGiftToJH2 = new Gift();
        jh.sendGift(myGiftToJH);
        jh.sendGift(myGiftToJH2);

        Gift[] myGiftToJHHistory = jh.getGiftHistory();

        System.out.println("JC gives " + myGiftToJHHistory.length + " gifts.");
    }
}
