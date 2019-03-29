package com.creational.patterns.singleton;

public class DbSingletonDemo {
  public static void main(String[] args) {
    DbSingleton instance = DbSingleton.getInstance();

    System.out.println("First Instance:  " + instance);

    DbSingleton anotherInstance = DbSingleton.getInstance();
    System.out.println("Second Instance: " + anotherInstance);
  }
}
