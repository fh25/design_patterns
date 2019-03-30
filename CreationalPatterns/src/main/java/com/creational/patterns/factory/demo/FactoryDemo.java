package com.creational.patterns.factory.demo;

import com.creational.patterns.factory.Website;
import com.creational.patterns.factory.WebsiteFactory;
import com.creational.patterns.factory.WebsiteType;

public class FactoryDemo {
  public static void main(String[] args) {
    Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
    System.out.println("Blog Site: " + site.getPages());
    site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
    System.out.println("Shop Site: " + site.getPages());

//  Calendar is an example of a factory, there are different calendars
//    that can be returned based on getInstance call with/without params
//    Calendar calendar = Calendar.getInstance();
//    System.out.println(calendar);
//    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
  }

}
