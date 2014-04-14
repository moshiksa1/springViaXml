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

        ApplicationContext ctx = new ClassPathXmlApplicationContext("libraryContainerConfig.xml");

        Library myLibrary = (Library)ctx.getBean("myLibrary");
        r1 = (BookReader)ctx.getBean("br1");
        r2 = (BookReader)ctx.getBean("br2");

        myLibrary.readerStepInsideLibrary(r1);
        myLibrary.readerStepInsideLibrary(r2);

        r1.printReader();
        r2.printReader();

        myLibrary.readerStepOutsideLibrary(r2);
        myLibrary.readerStepOutsideLibrary(r1);

//        for(Book b : myLibrary.getBookList())
//            b.printBook();
//        for(BookReader r : myLibrary.getBookReaders())
//            r.printReader();
    }
}
