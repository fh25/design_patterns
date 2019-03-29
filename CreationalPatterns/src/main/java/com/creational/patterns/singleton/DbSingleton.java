package com.creational.patterns.singleton;

public class DbSingleton {
  private static DbSingleton instance = new DbSingleton();

  // private so it can't be newed up
  private DbSingleton() {}

  public static DbSingleton getInstance() {
    return instance;
  }

}
