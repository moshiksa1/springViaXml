package org.springTest;

/**
 * Created by moshiks on 4/14/14.
 */
public class LibrarySpeaker {
    public void announceReaderStepInside(){
        System.out.println("Speaker announcement:");
        System.out.println("*************************************************");
        System.out.println("A book reader has steped inside the library");
        System.out.println("WELCOME BOOK READER");
        System.out.println("-------------------------------------------------");
    }

    public void announceReaderStepOutside(){
        System.out.println("Speaker announcement:");
        System.out.println("*************************************************");
        System.out.println("A book reader has steped outside the library");
        System.out.println("Goodbye book reader");
        System.out.println("-------------------------------------------------");
    }
}
