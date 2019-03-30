package com.creational.patterns.abstract_factory.factories;

import com.creational.patterns.abstract_factory.cards.CreditCard;
import com.creational.patterns.abstract_factory.type.CardType;
import com.creational.patterns.abstract_factory.validator.Validator;

public abstract class CreditCardFactory {
  public static CreditCardFactory getCreditCardFactory(int creditScore) {
    if(creditScore > 650) {
      return new AmexFactory();
    } else {
      return new VisaFactory();
    }
  }

  public abstract CreditCard getCreditCard(CardType cardType);
  public abstract Validator getValidator(CardType cardType);
}
