package lgwarlick.cards.service;

import lgwarlick.cards.model.Card;
import lgwarlick.cards.model.CardType;

import java.util.Set;

public interface CardService extends CrudService<Card, Long> {

    /**
     * A method to get all cards of a certain type (e.g. Agenda)
     * @param cardType
     * @return a set of cards matching cardType
     */
    Set<Card> findAllByType(CardType cardType);

}
