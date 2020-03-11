package book.bo;

import java.util.Objects;

public class Contact {
    private String lastName;
    private String firstName;
    private String phone;
    private Gender gender;

    public Contact() {
    }

    public Contact(String lastName, String firstName, String phone, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact)) return false;
        return lastName.equals(((Contact) o).lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, phone, gender);
    }
}
