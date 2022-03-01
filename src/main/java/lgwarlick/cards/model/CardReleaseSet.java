package lgwarlick.cards.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.HashSet;
import java.util.Set;

@Entity
public class CardReleaseSet extends BaseEntity {

    private String name;
    private String releaseDate;

    @OneToMany
    private Set<Card> releaseSet = new HashSet<>();

    public CardReleaseSet() {
    }

    public CardReleaseSet(String name, Set<Card> releaseSet, String releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseSet = releaseSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getReleaseSet() {
        return releaseSet;
    }

    public void setReleaseSet(Set<Card> cardsInRelease) {
        this.releaseSet = cardsInRelease;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
