package lgwarlick.cards.service.map;

import lgwarlick.cards.model.Card;

import lgwarlick.cards.model.CardType;
import lgwarlick.cards.service.CardService;
import lgwarlick.cards.service.CrudService;

import java.util.Set;

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
        return super.save(object.getId(),object);
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
        return null;
    }
}
