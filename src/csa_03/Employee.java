package csa_03;

// MyDate 类
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// Employee 类
abstract class Employee {
    private String name;
    private String number;
    private MyDate birthday;

    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString() {
        return "Employee{name='" + name + "', number='" + number + "', birthday=" + birthday + "}";
    }
}
