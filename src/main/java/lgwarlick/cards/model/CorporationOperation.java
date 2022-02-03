package lgwarlick.cards.model;

public class CorporationOperation extends Card{

    private Integer playCost;

    public CorporationOperation() {
    }

    public CorporationOperation(Integer playCost) {
        this.playCost = playCost;
    }

    public CorporationOperation(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer playCost) {
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
