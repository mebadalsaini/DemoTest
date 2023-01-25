package com.Badal.AbstractClassesAndInterfaces.Inheritance;
import java.util.Scanner;
interface Client{
    void input();
    void output();
}
interface Task{
    void Update();
    void Terminate();
}
public class Developer implements Client, Task{
    String name;
    double salary;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = in.nextLine();

        System.out.println("Enter the salary : ");
        salary = in.nextDouble();
    }
    public void output(){
        System.out.println("Name : " + name + "     BadaSalary : " + salary);
    }
    public void Update(){
        System.out.println("Update the project");
    }

    public void Terminate(){
        System.out.println("Terminate the project");
    }

    public static void main(String[] args) {
        Client c = new Developer();
        c.input();
        c.output();

        Task t = new Developer();
        t.Update();
        t.Terminate();

    }
 }
