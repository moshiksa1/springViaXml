package org.springTest;

import java.util.Date;

/**
 * Created by moshiks on 3/31/14.
 */
public abstract class Book implements IBook{
    private String titleName;
    private String author;
    private int pagesNumber;
    private double price;

    public Book(String titleName, String author, int pagesNumber, double price){
        this.titleName = titleName;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.price = price;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void printBook() {
        System.out.println("----- BOOK DETAILS -----");
        System.out.println("---------------------------------");
        System.out.println("Title name: " + titleName);
        System.out.println("Author name: " + author);
        System.out.println("Total pages number: " + pagesNumber);
        System.out.println("Price: " + price);
    }
}
