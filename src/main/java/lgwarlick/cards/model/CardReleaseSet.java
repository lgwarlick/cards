package lgwarlick.cards.model;

import java.util.Set;

public class CardReleaseSet extends BaseEntity {


    private String name;
    private Set<Card> cardsInRelease;


    public CardReleaseSet() {
    }

    public CardReleaseSet(String name, Set<Card> cardsInRelease) {
        this.name = name;
        this.cardsInRelease = cardsInRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getCardsInRelease() {
        return cardsInRelease;
    }

    public void setCardsInRelease(Set<Card> cardsInRelease) {
        this.cardsInRelease = cardsInRelease;
    }
}
