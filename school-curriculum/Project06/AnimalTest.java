public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal();

        dog.setColor("Black");
        dog.setAge(3);
        dog.setGender("male");

        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
        System.out.println(dog.getGender());

        dog.play();
        dog.run();
        dog.rest();

        dog.showAll();
    }
}

class Animal {
    private String color;
    private int age;
    private String gender;

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void play() {
        System.out.println("play!");
    }

    public void run() {
        System.out.println("run!");
    }

    public void rest() {
        System.out.println("rest!");
    }

    public void showAll() {
        System.err.println(color);
        System.err.println(age);
        System.err.println(gender);
    }
}
