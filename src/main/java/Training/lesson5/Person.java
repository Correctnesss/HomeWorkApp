package Training.lesson5;

public class Person {
    private String FCs;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String FCs, String post, String email, String phone, int salary, int age) {
        this.FCs = FCs;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        if (age > 40) {
            System.out.println("ФИО: " + FCs + " должность " + post + " email " + email + " телефон " + phone + " зарплата " + salary + " возраст " + age);

        }
    }

//    public static Person[] init() {
//        Person[] personArray = new Person[5];
//
//        for (int i = 0; i < personArray.length; i++) {
//            personArray[i] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        }
//        return personArray;
//}

}

