package com.company;

class Student {
    private int id;
    private String name;
    private int zipcode;

    public Student() {
        id = 8;
        name = "John";
        zipcode = 19090;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setid(int newid) {
        id = newid;
    }

    public void setname(String newname) {
        name = newname;
    }

    public void setZipcode(int newzip) {
        zipcode = newzip;
    }

    public String toString() {
        String result = Integer.toString(id) + " " + name + " " + Integer.toString(zipcode);
        return result;
    }

    public static void main(String[] args) {
        Student s0 = new Student();
        System.out.println(s0);
        Student s1 = new Student();
        s1.setid(312);
        s1.setname("Patrick");
        System.out.println("ID is " + s1.getid());
        System.out.println("The student name is " + s1.getname());
        Student s2 = new Student();
        s2.setZipcode(19015);
        System.out.println("The student zipcode is " + s1.getZipcode());
    }
}

