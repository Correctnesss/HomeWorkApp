package Training.lesson5;


public class DemoApp {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231217", 30000, 30);
        personArray[1] = new Person("Petrov Petr", "Development", "pepetr@mail.ru", "89263443073", 500000, 45);
        personArray[2] = new Person("Sidorov Gena", "DevOps", "Sidorov@gmail.com", "89994435566", 800000, 70);
        personArray[3] = new Person("Tihoy Roman", "Pro", "TihoyRo@inbox.com", "89555555555", 50000, 20);
        personArray[4] = new Person("Shadinov Alex", "Designer", "ShadinovAl@yandex.ru", "89666666666", 100000, 18);

//        Person[] personArray = Person.init();

        for (Person person : personArray) {
            person.info();
        }
    }


}
