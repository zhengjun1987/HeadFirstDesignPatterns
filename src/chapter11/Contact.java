package chapter11;

import chapter01.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 14:28
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String idCardNo;
    private String phoneNo;
    private int age;
    private boolean gender;
    private String email;
    private String userDeviceNo;


    public static final class ContactBuilder {
        private String firstName;
        private String lastName;
        private String idCardNo;
        private String phoneNo;
        private int age;
        private boolean gender;
        private String email;
        private String userDeviceNo;

        private ContactBuilder() {
        }

        public static ContactBuilder builder() {
            return new ContactBuilder();
        }

        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder idCardNo(String idCardNo) {
            this.idCardNo = idCardNo;
            return this;
        }

        public ContactBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public ContactBuilder age(int age) {
            this.age = age;
            return this;
        }

        public ContactBuilder gender(boolean gender) {
            this.gender = gender;
            return this;
        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder userDeviceNo(String userDeviceNo) {
            this.userDeviceNo = userDeviceNo;
            return this;
        }

        public ContactBuilder but() {
            return builder().firstName(firstName).lastName(lastName).idCardNo(idCardNo).phoneNo(phoneNo).age(age).gender(gender).email(email).userDeviceNo(userDeviceNo);
        }

        public Contact build() {
            Contact contact = new Contact();
            contact.userDeviceNo = this.userDeviceNo;
            contact.lastName = this.lastName;
            contact.idCardNo = this.idCardNo;
            contact.gender = this.gender;
            contact.phoneNo = this.phoneNo;
            contact.firstName = this.firstName;
            contact.age = this.age;
            contact.email = this.email;
            return contact;
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", userDeviceNo='" + userDeviceNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Contact contact = ContactBuilder.builder().firstName("Zheng").lastName("Jun").email("zhengjun1987@outlook.com")
                .idCardNo("0660063")
                .age(30).gender(true).phoneNo("17131420668").build();
        System.out.println(MyUtils.getCurrentTime() +contact);
    }
}
//2018-01-05 14:41:43:966  Contact{firstName='Zheng', lastName='Jun', idCardNo='0660063', phoneNo='17131420668', age=30, gender=true, email='zhengjun1987@outlook.com', userDeviceNo='null'}
