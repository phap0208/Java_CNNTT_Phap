package Person;

public class TestPerson {
    public static void main(String[] args) {
        Student s = new Student("phap", 23, "Ha Noi", 8.9);
        s.display();
        System.out.println();
        Teacher t = new Teacher("nha", 34, "Ha Noi", 1200);
        t.display();
    }
}
