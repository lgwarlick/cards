package lgwarlick.cards.model;

import java.util.Set;

public class CardReleaseSet extends BaseEntity {


    private String name;
    private String releaseDate;
    private Set<Card> cardsInRelease;


    public CardReleaseSet() {
    }

    public CardReleaseSet(String name, Set<Card> cardsInRelease, String releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
