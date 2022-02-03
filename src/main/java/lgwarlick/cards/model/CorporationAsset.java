package lgwarlick.cards.model;

public class CorporationAsset extends Card{

    private Integer rezCost;
    private Integer trashCost;

    public CorporationAsset() {
    }

    public CorporationAsset(Integer rezCost, Integer trashCost) {
        this.rezCost = rezCost;
        this.trashCost = trashCost;
    }

    public CorporationAsset(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer rezCost, Integer trashCost) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.rezCost = rezCost;
        this.trashCost = trashCost;
    }

    public Integer getRezCost() {
        return rezCost;
    }

    public void setRezCost(Integer rezCost) {
        this.rezCost = rezCost;
    }

    public Integer getTrashCost() {
        return trashCost;
    }

    public void setTrashCost(Integer trashCost) {
        this.trashCost = trashCost;
    }
}
