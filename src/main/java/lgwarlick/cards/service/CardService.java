package lgwarlick.cards.service;

import lgwarlick.cards.model.Card;

import java.util.Set;

public interface CardService {

    Card findByID(Long id);

    Set<Card> findAll();

}
