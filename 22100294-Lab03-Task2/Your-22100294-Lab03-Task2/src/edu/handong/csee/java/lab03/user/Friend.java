package edu.handong.csee.java.lab03.user;

import edu.handong.csee.java.lab03.gift.Gift;

public class Friend extends User {

    private boolean isFavorite;
    private Gift[] giftHistory = new Gift[100];
    private int totalGift = 0;

    public boolean getIsFavorite(){
        return isFavorite;
    }
    
    public void setIsFavorite(boolean favorite){
       isFavorite = favorite;
    }

    public void sendGift(Gift giftTogive) {
        giftHistory[totalGift] = giftTogive;
        totalGift++;
    }

    public Gift[] getGiftHistory() {
        return giftHistory;
    }
}