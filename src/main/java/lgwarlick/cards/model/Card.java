package lgwarlick.cards.model;

public class Card extends BaseEntity {


    private String name;
    private CardReleaseSet set;

    public Card() {
    }

    public Card(String name, CardReleaseSet set) {
        this.name = name;
        this.set = set;
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

    public CardReleaseSet getSet() {
        return set;
    }

    public void setSet(CardReleaseSet set) {
        this.set = set;
    }
}
