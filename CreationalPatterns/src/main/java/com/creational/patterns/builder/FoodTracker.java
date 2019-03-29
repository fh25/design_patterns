package com.creational.patterns.builder;

public class FoodTracker {

  public static class Builder {
    private String mealTime;
    private String entree;
    private String side;
    private String drink;
    private Integer estimatedCalories;

    public Builder() {}

    public FoodTracker build() {
      return new FoodTracker(this);
    }

    public Builder mealTime(String mealTime) {
      this.mealTime = mealTime;
      return this;
    }

    public Builder entree(String entree) {
      this.entree = entree;
      return this;
    }

    public Builder side(String side) {
      this.side = side;
      return this;
    }

    public Builder drink(String drink) {
      this.drink = drink;
      return this;
    }

    public Builder estimatedCalories(Integer estimatedCalories) {
      this.estimatedCalories = estimatedCalories;
      return this;
    }
  }

  private String mealTime;
  private String entree;
  private String side;
  private String drink;
  private Integer estimatedCalories;

  private FoodTracker(Builder builder) {
    this.mealTime = builder.mealTime;
    this.drink = builder.drink;
    this.entree = builder.entree;
    this.estimatedCalories = builder.estimatedCalories;
    this.side = builder.side;
  }

  public String getMealTime() {
    return mealTime;
  }

  public String getEntree() {
    return entree;
  }

  public String getSide() {
    return side;
  }

  public String getDrink() {
    return drink;
  }

  public Integer getEstimatedCalories() {
    return estimatedCalories;
  }
}
