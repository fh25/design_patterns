package com.creational.patterns.abstract_factory.factories;

import com.creational.patterns.abstract_factory.cards.CreditCard;
import com.creational.patterns.abstract_factory.cards.VisaGoldCreditCard;
import com.creational.patterns.abstract_factory.cards.VisaPlatinumCard;
import com.creational.patterns.abstract_factory.type.CardType;
import com.creational.patterns.abstract_factory.validator.*;

public class VisaFactory extends CreditCardFactory {
  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch(cardType) {
      case GOLD: return new VisaGoldCreditCard();
      case PLATINUM: return new VisaPlatinumCard();
    }
    return null;
  }

  @Override
  public Validator getValidator(CardType cardType) {
    switch(cardType) {
      case GOLD: return new VisaGoldValidator();
      case PLATINUM: return new VisaPlatinumValidator();
      default: break;
    }

    return null;
  }
}
