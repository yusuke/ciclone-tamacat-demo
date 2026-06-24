package com.example;

import java.util.Objects;

@SuppressWarnings("ALL")
public class リファクタリング演習 {
    public static void main(String[] args) {
        var companyName = "Samuraism Inc.";

        var str2 = "テキストブロック\n" +
                "こんにちは\n";
        System.out.println(str2);

        Person nobunaga = new Person("織田信長", 47);
        System.out.println(nobunaga.getName() + " 享年:" +nobunaga.getAge());
    }
}

class Person{
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}