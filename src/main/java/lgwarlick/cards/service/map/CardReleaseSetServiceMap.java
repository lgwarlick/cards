package lgwarlick.cards.service.map;

import lgwarlick.cards.model.CardReleaseSet;
import lgwarlick.cards.service.CardReleaseSetService;
import lgwarlick.cards.service.CrudService;

import java.util.Set;

public class CardReleaseSetServiceMap extends AbstractMapService<CardReleaseSet, Long> implements CrudService<CardReleaseSet, Long> {


    @Override
    public Set<CardReleaseSet> findAll() {
        return super.findAll();
    }

    @Override
    public CardReleaseSet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(CardReleaseSet cardReleaseSet) {
        super.delete(cardReleaseSet);
    }

    @Override
    public CardReleaseSet save(CardReleaseSet cardReleaseSet) {
        return super.save(cardReleaseSet.getId(), cardReleaseSet);
    }
}
