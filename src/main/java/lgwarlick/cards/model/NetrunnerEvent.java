package lgwarlick.cards.model;

public class NetrunnerEvent extends Card {

    Integer playCost;

    public NetrunnerEvent() {
    }

    public NetrunnerEvent(Integer playCost) {
        this.playCost = playCost;
    }

    public NetrunnerEvent(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer playCost) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.playCost = playCost;
    }

    public Integer getPlayCost() {
        return playCost;
    }

    public void setPlayCost(Integer playCost) {
        this.playCost = playCost;
    }
}
