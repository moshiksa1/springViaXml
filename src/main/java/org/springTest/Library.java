package org.springTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by moshiks on 3/31/14.
 */
public class Library {
    private List<Book> bookList;
    private HashSet<BookReader> bookReaders;

    public Library(){
        bookList = new ArrayList<Book>();
        bookReaders = new HashSet<BookReader>();
    }

//    public void setBookList(Book myBook){
//        bookList.add(myBook);
//    }

//    public void setBookReaders(BookReader myReader){
//        bookReaders.add(myReader);
//    }
//    public Library(List<Book> bookList, HashSet<BookReader> bookReaders){
//        this.setBookList(bookList);
//        this.setBookReaders(bookReaders);
//    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public HashSet<BookReader> getBookReaders() {
        return bookReaders;
    }

    public void setBookReaders(HashSet<BookReader> bookReaders) {
        this.bookReaders = bookReaders;
    }
}
