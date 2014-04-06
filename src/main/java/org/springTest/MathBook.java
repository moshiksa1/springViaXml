package org.springTest;

import java.util.Date;

/**
 * Created by moshiks on 3/31/14.
 */
public class MathBook extends Book {
    private String level;
    private int totalExerciseNum;
    private boolean isHasFormulas;

    public MathBook(String titleName, String author, int pagesNumber, double price, String level,
                    int totalExerciseNum, boolean isHasFormulas){
        super(titleName, author, pagesNumber, price);
        this.level = level;
        this.totalExerciseNum = totalExerciseNum;
        this.isHasFormulas = isHasFormulas;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTotalExerciseNum() {
        return totalExerciseNum;
    }

    public void setTotalExerciseNum(int totalExerciseNum) {
        this.totalExerciseNum = totalExerciseNum;
    }

    public boolean isHasFormulas() {
        return isHasFormulas;
    }

    public void setHasFormulas(boolean isHasFormulas) {
        this.isHasFormulas = isHasFormulas;
    }

    @Override
    public void printBook() {
        System.out.println("This is a Math book");
        System.out.println("----------------------------------------------------------------------");
        super.printBook();
        System.out.println("More Details:");
        System.out.println("***********************");
        System.out.println("Level: " + level);
        System.out.println("Total exercise Number: " + totalExerciseNum);
        System.out.println("Is this math book has formulas: " + isHasFormulas);
    }
}
