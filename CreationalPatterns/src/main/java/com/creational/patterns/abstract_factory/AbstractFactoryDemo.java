package com.creational.patterns.abstract_factory;

import com.creational.patterns.abstract_factory.cards.CreditCard;
import com.creational.patterns.abstract_factory.factories.CreditCardFactory;
import com.creational.patterns.abstract_factory.type.CardType;

public class AbstractFactoryDemo {
  public static void main(String [] args) {
//  Concrete credit card class is not known, created given parameters
    CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(765);
    CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
    System.out.println(card.getClass());

    CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(600);
    CreditCard card2 = abstractFactory2.getCreditCard(CardType.GOLD);
    System.out.println(card2.getClass());
  }
}
