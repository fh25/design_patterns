package com.creational.patterns.abstract_factory.validator;

import com.creational.patterns.abstract_factory.cards.CreditCard;

public class VisaPlatinumValidator implements Validator {
  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }
}
