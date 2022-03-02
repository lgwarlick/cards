package lgwarlick.cards.service.map;

import lgwarlick.cards.model.Card;

import lgwarlick.cards.model.CardType;
import lgwarlick.cards.model.Faction;
import lgwarlick.cards.service.CardService;
import lgwarlick.cards.service.CrudService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CardServiceMap extends AbstractMapService<Card, Long> implements CardService {

    @Override
    public Set<Card> findAll() {
        return super.findAll();
    }

    @Override
    public Card findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Card save(Card object) {
        return super.save(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Card object) {
        super.delete(object);
    }

    /**
     *
     * @param cardType
     * @return all cards that meet cardType (e.g. Agenda)
     */
    @Override
    public Set<Card> findAllByType(CardType cardType) {

        Set<Card> allCardsOfType = new HashSet<>();

        map.forEach((aLong, card) -> {
            if(card.getCardType() == cardType){
                allCardsOfType.add(card);
            }
        });

        return allCardsOfType;
    }

    @Override
    public Set<Card> findAllByFaction(Faction faction) {

        Set<Card> allCardsOfFaction = new HashSet<>();

        map.forEach((aLong, card) -> {
            if (card.getFaction() == faction){
                allCardsOfFaction.add(card);
            }
        });

        return allCardsOfFaction;
    }
}
