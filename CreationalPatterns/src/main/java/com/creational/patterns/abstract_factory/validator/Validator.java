package com.creational.patterns.abstract_factory.validator;

import com.creational.patterns.abstract_factory.cards.CreditCard;

public interface Validator {
  public boolean isValid(CreditCard creditCard);
}
