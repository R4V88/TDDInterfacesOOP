package model;

public class Student {
    private long id;
    private String name;
    private String lastname;
    private int age;

    public Student() {
    }

    public Student(long id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id= " + id +
                ", name= " + name +
                ", lastname= " + lastname +
                ", age= " + age +
                ".";
    }
}
