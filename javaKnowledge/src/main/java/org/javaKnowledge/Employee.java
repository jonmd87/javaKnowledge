package org.javaKnowledge;

import java.util.Objects;

public class Employee {
    /**
     ** Создать класс Сотрудник (Employee).
     ** У класса должны быть следующие поля:
     **    1. Возраст (int)
     **    2. Имя (String)
     **    3. Фамилия (String)
     **    4. Зарплата (double)
     **    5. ... можно придумать свои поля
     */
    private int age;
    private String name;
    private String lastName;
    private Double salary;

    /**
     * У класса должно быть 2 конструктора:
     * 1. Конструктор, который принимает все аргументы
     **/
    public Employee(int age, String name, String lastName, Double salary) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

/**
 * 2. Констуктор, который принимает все аргументы КРОМЕ зарплаты;
 * значение зарплаты должно быть задано значением по умолчанию (50.0)
 **/
    public Employee(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.salary = 50.0;
    }
/**
 * Переопределить:
 * 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
 **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, lastName, salary);
    }

    /**
     * 2. Метод toString (в любом формате)
     **/
    @Override
    public String toString() {
        return String.format("%s; age: %d; salary: %f",
                getFullName(), age, salary);
    }

    public int getAge() {
        return age;
    }

    /**
     * Реализовать методы:
     * String getFullName() - возвращает полное имя сотрудника
     **/
    public String getFullName() {
        return String.format("%s %s", name, lastName);
    }
    /**
     * boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
     * */

    public boolean olderThan(Employee emp) {
        return (emp.getAge() < age);
    }
    /**
    * void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0
    */
    public void upgrade(double newSalary) {
        salary += newSalary;
    }

}
