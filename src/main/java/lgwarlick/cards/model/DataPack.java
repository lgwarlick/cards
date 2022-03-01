package lgwarlick.cards.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class DataPack extends BaseEntity {

    private String name;
    private String releaseDate;

    @OneToMany(mappedBy = "dataPack")
    private Set<Card> dataPack = new HashSet<>();

    public DataPack() {
    }

    public DataPack(String name, Set<Card> dataPack, String releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.dataPack = dataPack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Card> getDataPack() {
        return dataPack;
    }

    public void setDataPack(Set<Card> cardsInRelease) {
        this.dataPack = cardsInRelease;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
