package lgwarlick.cards.model;

public class NetrunnerHardware extends Card {

    private Integer installCost;

    public NetrunnerHardware(Integer installCost) {
        this.installCost = installCost;
    }

    public NetrunnerHardware(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer installCost) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.installCost = installCost;
    }

    public Integer getInstallCost() {
        return installCost;
    }

    public void setInstallCost(Integer installCost) {
        this.installCost = installCost;
    }
}
