package com.creational.patterns.abstract_factory.factories;

import com.creational.patterns.abstract_factory.cards.CreditCard;
import com.creational.patterns.abstract_factory.cards.AmexGoldCreditCard;
import com.creational.patterns.abstract_factory.cards.AmexPlatinumCreditCard;
import com.creational.patterns.abstract_factory.type.CardType;
import com.creational.patterns.abstract_factory.validator.AmexGoldValidator;
import com.creational.patterns.abstract_factory.validator.AmexPlatinumValidator;
import com.creational.patterns.abstract_factory.validator.Validator;

public class AmexFactory extends CreditCardFactory {
  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch(cardType) {
      case GOLD: return new AmexGoldCreditCard();
      case PLATINUM: return new AmexPlatinumCreditCard();
      default: break;
    }

    return null;
  }

  @Override
  public Validator getValidator(CardType cardType) {
    switch(cardType) {
      case GOLD: return new AmexGoldValidator();
      case PLATINUM: return new AmexPlatinumValidator();
      default: break;
    }

    return null;
  }
}
