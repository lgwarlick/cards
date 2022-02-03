package lgwarlick.cards.model;

public class NetrunnerProgram extends Card {

    private Integer installCost;
    private Integer memoryCost;
    private Integer strength;

    public NetrunnerProgram(Integer installCost, Integer memoryCost, Integer strength) {
        this.installCost = installCost;
        this.memoryCost = memoryCost;
        this.strength = strength;
    }

    public NetrunnerProgram(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer installCost, Integer memoryCost, Integer strength) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.installCost = installCost;
        this.memoryCost = memoryCost;
        this.strength = strength;
    }

    public Integer getInstallCost() {
        return installCost;
    }

    public void setInstallCost(Integer installCost) {
        this.installCost = installCost;
    }

    public Integer getMemoryCost() {
        return memoryCost;
    }

    public void setMemoryCost(Integer memoryCost) {
        this.memoryCost = memoryCost;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
