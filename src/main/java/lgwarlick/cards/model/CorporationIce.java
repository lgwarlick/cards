package lgwarlick.cards.model;

public class CorporationIce extends Card {

    private Integer rezCost;
    private Integer strength;

    public CorporationIce(Integer rezCost, Integer strength) {
        this.rezCost = rezCost;
        this.strength = strength;
    }

    public CorporationIce(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer rezCost, Integer strength) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.rezCost = rezCost;
        this.strength = strength;
    }

    public Integer getRezCost() {
        return rezCost;
    }

    public void setRezCost(Integer rezCost) {
        this.rezCost = rezCost;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
