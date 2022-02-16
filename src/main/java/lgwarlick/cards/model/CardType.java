package lgwarlick.cards.model;

public enum CardType {

    CORPORATIONIDENTITY("Corporation Identity"),
    OPERATION("Operation"),
    AGENDA("Agenda"),
    ICE("Ice"),
    UPGRADE("Upgrade"),
    ASSET("Asset"),


    RUNNERIDENTITY("Runner Identity"),
    HARDWARE(""),
    RESOURCE("Resource"),
    PROGRAM("Program"),
    EVENT("Event");

    private String name;

    CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
