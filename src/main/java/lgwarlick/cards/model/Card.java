package lgwarlick.cards.model;

public class Card extends BaseEntity {


    private String name;
    private String faction;
    private Integer influenceCost;
    private CardReleaseSet set;
    private String cardText;
    private String flavorText;

    public Card() {
    }

    public Card(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText) {
        this.name = name;
        this.faction = faction;
        this.influenceCost = influenceCost;
        this.set = set;
        this.cardText = cardText;
        this.flavorText = flavorText;
    }

    /**
     * Getters
     * Setters
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public Integer getInfluenceCost() {
        return influenceCost;
    }

    public void setInfluenceCost(Integer influenceCost) {
        this.influenceCost = influenceCost;
    }

    public CardReleaseSet getSet() {
        return set;
    }

    public void setSet(CardReleaseSet set) {
        this.set = set;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }
}
