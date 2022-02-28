package lgwarlick.cards.service.h2;

import lgwarlick.cards.model.Card;
import lgwarlick.cards.model.CardType;
import lgwarlick.cards.repository.CardRepository;
import lgwarlick.cards.service.CardService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Primary
public class CardServiceH2 implements CardService {

    private final CardRepository cardRepository;

    public CardServiceH2(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Set<Card> findAllByType(CardType cardType) {
        return null;
    }

    @Override
    public Set<Card> findAll() {

        Iterable<Card> findAllCards = cardRepository.findAll();
        Set<Card> allCards = new HashSet<>();
        findAllCards.forEach(allCards::add);
        return allCards;

    }

    @Override
    public Card findByID(Long id) {
        return null;
    }

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public void delete(Card card) {
        cardRepository.delete(card);
    }

    @Override
    public void deleteByID(Long id) {
        cardRepository.deleteById(id);
    }
}
