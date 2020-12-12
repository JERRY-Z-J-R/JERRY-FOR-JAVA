package cxtc.jk03;

class Human {
    public String name;
    public String gender;
    public int age;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void learning() {
        System.out.println("Human learning……");
    }
}

class Pupil extends Human {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pupil() {
    }

    public Pupil(String name, String gender, int age, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public void learning() {
        System.out.println("Pupil learning……");
    }
}

class Student extends Pupil {
    public Student() {
    }

    public Student(String name, String gender, int age, int id) {
        super.setId(id);
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void learning() {
        System.out.println("Student learning……");
    }

    public void listAttributes() {
        System.out.println("name:" + name + ", " + "gender:" + gender + ", " + "age:" + age + ", " + "id:" + super.getId());
    }
}


public class HomeWork02 {
    public static void main(String[] ags) {
        Student jerry = new Student("jerry", "male", 20, 40);
        Student dragon = new Student("dragon", "Female", 19, 24);
        jerry.learning();
        jerry.listAttributes();
        dragon.learning();
        dragon.listAttributes();
    }
}
