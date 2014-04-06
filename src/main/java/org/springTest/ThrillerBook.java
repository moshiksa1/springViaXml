package org.springTest;

import java.util.Date;

/**
 * Created by moshiks on 3/31/14.
 */
public class ThrillerBook extends Book {
    private int keyCharacter;
    private int subCharacter;
    private boolean isGoodEnd;

    public ThrillerBook(String titleName, String author, int pagesNumber, double price, int keyCharacter,
                        int subCharacter, boolean isGoodEnd){
        super(titleName, author, pagesNumber, price);
        this.keyCharacter = keyCharacter;
        this.subCharacter = subCharacter;
        this.isGoodEnd = isGoodEnd;
    }

    public int getKeyCharacter() {
        return keyCharacter;
    }

    public void setKeyCharacter(int keyCharacter) {
        this.keyCharacter = keyCharacter;
    }

    public int getSubCharacter() {
        return subCharacter;
    }

    public void setSubCharacter(int subCharacter) {
        this.subCharacter = subCharacter;
    }

    public boolean isGoodEnd() {
        return isGoodEnd;
    }

    public void setGoodEnd(boolean isGoodEnd) {
        this.isGoodEnd = isGoodEnd;
    }

    @Override
    public void printBook() {
        System.out.println("This is a Thriller book");
        System.out.println("----------------------------------------------------------------------");
        super.printBook();
        System.out.println("More Details:");
        System.out.println("***********************");
        System.out.println("Number of key characters: " + keyCharacter);
        System.out.println("Number of sub characters: " + subCharacter);
        System.out.println("Is this thriller book has a good end: " + isGoodEnd);
    }
}
