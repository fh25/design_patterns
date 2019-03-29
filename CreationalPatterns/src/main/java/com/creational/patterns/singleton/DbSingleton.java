package com.creational.patterns.singleton;

public class DbSingleton {
  private static DbSingleton instance = null;

  // private so it can't be newed up
  private DbSingleton() {}

  public static DbSingleton getInstance() {
    if(instance == null) {
      instance = new DbSingleton();
    }

    return instance;
  }

}
