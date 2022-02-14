package lgwarlick.cards.model;

public class Card extends BaseEntity {


    private String name;
    private Faction faction;
    private CardType cardType;
    private Integer influenceCost;
    private CardReleaseSet set;
    private String cardText;
    private String flavorText;

    /**
     * Corporation Card Attributes
     */

    private Integer advancementRequirement;
    private Integer agendaPoints;
    private Integer rezCost;
    private Integer trashCost;

    /**
     * Netrunner Card Attributes
     */

    private Integer installCost;
    private Integer baseLink;
    private Integer memoryCost;

    /**
     * Shared Attributes
     */

    private Integer minimumDeckSize;
    private Integer influenceLimit;
    private Integer strength;
    private Integer playCost;

    public Card() {
    }

    public Card(String name, Faction faction, CardType cardType, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer advancementRequirement, Integer agendaPoints, Integer rezCost, Integer trashCost, Integer installCost, Integer baseLink, Integer memoryCost, Integer minimumDeckSize, Integer influenceLimit, Integer strength, Integer playCost) {
        this.name = name;
        this.faction = faction;
        this.cardType = cardType;
        this.influenceCost = influenceCost;
        this.set = set;
        this.cardText = cardText;
        this.flavorText = flavorText;
        this.advancementRequirement = advancementRequirement;
        this.agendaPoints = agendaPoints;
        this.rezCost = rezCost;
        this.trashCost = trashCost;
        this.installCost = installCost;
        this.baseLink = baseLink;
        this.memoryCost = memoryCost;
        this.minimumDeckSize = minimumDeckSize;
        this.influenceLimit = influenceLimit;
        this.strength = strength;
        this.playCost = playCost;
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

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
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

    public Integer getAdvancementRequirement() {
        return advancementRequirement;
    }

    public void setAdvancementRequirement(Integer advancementRequirement) {
        this.advancementRequirement = advancementRequirement;
    }

    public Integer getAgendaPoints() {
        return agendaPoints;
    }

    public void setAgendaPoints(Integer agendaPoints) {
        this.agendaPoints = agendaPoints;
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

    public Integer getInstallCost() {
        return installCost;
    }

    public void setInstallCost(Integer installCost) {
        this.installCost = installCost;
    }

    public Integer getBaseLink() {
        return baseLink;
    }

    public void setBaseLink(Integer baseLink) {
        this.baseLink = baseLink;
    }

    public Integer getMemoryCost() {
        return memoryCost;
    }

    public void setMemoryCost(Integer memoryCost) {
        this.memoryCost = memoryCost;
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

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getPlayCost() {
        return playCost;
    }

    public void setPlayCost(Integer playCost) {
        this.playCost = playCost;
    }
}
