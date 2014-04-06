package org.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Date;

/**
 * Created by moshiks on 3/31/14.
 */
public class myMain {
    public static void main(String[] args) {
        Book b1,b2,b3,b4;
        BookReader r1,r2,r3;

//        b1 = new MathBook("Trigo", "Beni Goren", 789, 89.99, "Hard", 987, true);
//        b2 = new ThrillerBook("Kenshoo go to hell", "Moshik Salem", 123, 34.89, 4, 3, false);

//        r1 = new BookReader("Moshik", "Salem", 30, "021787221", "0547226999");
//        r2 = new BookReader("Liron", "Salem", 33, "0986423388", "0507998526");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("libraryContainerConfig.xml");

//        b1 = (MathBook) ctx.getBean("myMathBook");
//        b2 = (ThrillerBook) ctx.getBean("myThrillerBook");

//        r1 = (BookReader) ctx.getBean("moshikReader");
//        r2 = (BookReader) ctx.getBean("lironReader");

        Library myLibrary = (Library)ctx.getBean("myLibrary");

        for(Book b : myLibrary.getBookList())
            b.printBook();
        for(BookReader r : myLibrary.getBookReaders())
            r.printReader();
    }
}
