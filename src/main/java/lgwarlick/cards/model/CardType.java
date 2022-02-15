package lgwarlick.cards.model;

public enum CardType {

    CORPORATION_IDENTITY("Corporation Identity"),
    OPERATION("Operation"),
    AGENDA("Agenda"),
    ICE("Ice"),
    UPGRADE("Upgrade"),
    ASSET("Asset"),


    RUNNER_IDENTITY("Runner Identity"),
    HARDWARE(""),
    RESOURCE("Resource"),
    PROGRAM("Program"),
    EVENTS("Events");

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
