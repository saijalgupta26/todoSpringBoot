package com.example.demo;

public class Course {

        private long id;
        private String name;

    public String getName() {
        return name;
    }

    public Course(long id,String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
