package lgwarlick.cards.model;

public class CorporationIdentity extends Card {

    private Integer minimumDeckSize;
    private Integer influenceLimit;

    public CorporationIdentity() {
    }

    public CorporationIdentity(Integer minimumDeckSize, Integer influenceLimit) {
        this.minimumDeckSize = minimumDeckSize;
        this.influenceLimit = influenceLimit;
    }

    public CorporationIdentity(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer minimumDeckSize, Integer influenceLimit) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.minimumDeckSize = minimumDeckSize;
        this.influenceLimit = influenceLimit;
    }

    public Integer getMinimumDeckSize() {
        return minimumDeckSize;
    }

    public void setMinimumDeckSize(Integer minimumDeckSize) {
        this.minimumDeckSize = minimumDeckSize;
    }

    public Integer getInfluenceLimit() {
        return influenceLimit;
    }

    public void setInfluenceLimit(Integer influenceLimit) {
        this.influenceLimit = influenceLimit;
    }
}
