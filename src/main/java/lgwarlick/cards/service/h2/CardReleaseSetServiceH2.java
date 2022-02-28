package lgwarlick.cards.service.h2;

import lgwarlick.cards.model.Card;
import lgwarlick.cards.model.CardReleaseSet;
import lgwarlick.cards.repository.CardReleaseSetRepository;
import lgwarlick.cards.service.CardReleaseSetService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Primary
public class CardReleaseSetServiceH2 implements CardReleaseSetService {


    private final CardReleaseSetRepository cardReleaseSetRepository;

    public CardReleaseSetServiceH2(CardReleaseSetRepository cardReleaseSetRepository) {
        this.cardReleaseSetRepository = cardReleaseSetRepository;
    }

    @Override
    public Set<CardReleaseSet> findAll() {

        Iterable<CardReleaseSet> findAllReleaseSets = cardReleaseSetRepository.findAll();
        Set<CardReleaseSet> allReleaseSets = new HashSet<>();
        findAllReleaseSets.forEach(allReleaseSets::add);
        return allReleaseSets;

    }

    @Override
    public CardReleaseSet findByID(Long aLong) {
        return null;
    }

    @Override
    public CardReleaseSet save(CardReleaseSet object) {
        return cardReleaseSetRepository.save(object);
    }

    @Override
    public void delete(CardReleaseSet object) {
        cardReleaseSetRepository.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        cardReleaseSetRepository.deleteById(id);
    }
}
