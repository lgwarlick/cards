package lgwarlick.cards.model;

public class NetrunnerIdentity extends Card {

    private Integer baseLink;
    private Integer minimumDeckSize;
    private Integer influenceLimit;

    public NetrunnerIdentity() {
    }

    public NetrunnerIdentity(Integer baseLink, Integer minimumDeckSize, Integer influenceLimit) {
        this.baseLink = baseLink;
        this.minimumDeckSize = minimumDeckSize;
        this.influenceLimit = influenceLimit;
    }

    public NetrunnerIdentity(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer baseLink, Integer minimumDeckSize, Integer influenceLimit) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.baseLink = baseLink;
        this.minimumDeckSize = minimumDeckSize;
        this.influenceLimit = influenceLimit;
    }

    public Integer getBaseLink() {
        return baseLink;
    }

    public void setBaseLink(Integer baseLink) {
        this.baseLink = baseLink;
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
