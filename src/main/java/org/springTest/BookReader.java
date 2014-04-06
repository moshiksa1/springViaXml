package org.springTest;

/**
 * Created by moshiks on 3/31/14.
 */
public class BookReader {
    private String firstName;
    private String lastName;
    private int age;
    private String id;
    private String phoneNumber;

    public BookReader(String firstName, String lastName, int age, String id, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
