package com.creational.patterns.builder;

public class BuilderDemo {
//  construct a complex object from simple objects using step-by-step approach
  public static void main(String[] args) {

    FoodTracker.Builder builder = new FoodTracker.Builder();
    builder.mealTime("Breakfast")
            .entree("Bacon and Eggs")
            .side("Apple")
            .drink("Orange Juice")
            .estimatedCalories(450);

    FoodTracker breakfast = builder.build();

    System.out.println(breakfast.getDrink());
    System.out.println(breakfast.getEntree());
    System.out.println(breakfast.getSide());
    System.out.println(breakfast.getMealTime());
    System.out.println(breakfast.getEstimatedCalories());

//    Another example of Builder pattern is StringBuilder
//    StringBuilder sb = new StringBuilder();
//    sb.append("This is ");
//    sb.append("an example of ");
//    sb.append("a StringBuilder ");
//    sb.append("pattern.");
//
//    System.out.println(sb.toString());
  }
}
