package org.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by moshiks on 3/31/14.
 */
public class Library {
    private List<Book> bookList;
//    @Resource(name = "bookReader1")
//    @Qualifier("myReader")
    private Set<BookReader> bookReaders;

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

    @Autowired
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Set<BookReader> getBookReaders() {
        return bookReaders;
    }

/*
    @Autowired
    @Qualifier(value = "myReader")
    public void setBookReaders(Set<BookReader> bookReaders) {
        this.bookReaders = bookReaders;
    }*/

    public void readerStepInsideLibrary(BookReader reader){
        bookReaders.add(reader);
    }


    public void readerStepOutsideLibrary(BookReader reader){
        bookReaders.remove(reader);
    }
}
