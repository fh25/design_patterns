package com.creational.patterns.singleton;

public class DbSingleton {
//  volatile keyword used to ensure that singleton remains throughout JVM
  private static volatile DbSingleton instance = null;

  // private so it can't be newed up and protect against Reflection
  private DbSingleton() {
    if(instance != null) {
      throw new RuntimeException("Use getInstance() to create");
    }
  }

//  Make thread safe
//  If 2 threads come in, synchronize...don't sync method since that'd
//  be a performance hit. Sync inside method with another null check
  public static DbSingleton getInstance() {
    if(instance == null) {
      synchronized (DbSingleton.class) {
        if(instance == null) {
          instance = new DbSingleton();
        }
      }
    }

    return instance;
  }

}
