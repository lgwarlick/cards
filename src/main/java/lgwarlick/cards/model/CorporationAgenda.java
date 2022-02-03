package lgwarlick.cards.model;

public class CorporationAgenda extends Card{

    private Integer advancementRequirement;
    private Integer agendaPoints;

    public CorporationAgenda(Integer advancementRequirement, Integer agendaPoints) {
        this.advancementRequirement = advancementRequirement;
        this.agendaPoints = agendaPoints;
    }

    public CorporationAgenda(String name, String faction, Integer influenceCost, CardReleaseSet set, String cardText, String flavorText, Integer advancementRequirement, Integer agendaPoints) {
        super(name, faction, influenceCost, set, cardText, flavorText);
        this.advancementRequirement = advancementRequirement;
        this.agendaPoints = agendaPoints;
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
}
