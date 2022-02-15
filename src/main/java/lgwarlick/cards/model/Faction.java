package lgwarlick.cards.model;

public enum Faction {
    HAAS_BIOROID("Haas-Bioroid"),
    JINTEKI("Jinteki"),
    WEYLAND_CONSORTIUM("Weyland Consortium"),

    NBN("NBN"),
    ANARCH("Anarch"),
    CRIMINAL("Criminal"),
    SHAPER("Shaper"),

    NEUTRAL("Neutral");

    private String name;

    Faction(String name) {
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
