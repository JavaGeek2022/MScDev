package saveOurPlanet_Game;

/*
 * @author SusieMagill - 40028330
 * Superclass squares
 */
class Square {
    private String name;

    private int purchaseCost;
    private int minorDev;
    private boolean majorDev;
    private boolean owned;
    private Field field;
    

    public Square(String name, int purchaseCost, int minorDev, boolean majDev) {
        this.name = name;
        this.purchaseCost = purchaseCost;
        this.minorDev = minorDev;
        this.majorDev = majDev;
    }

    
 //Setting getters and setters
    /**
     * @return the field
     */
    public Field getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(Field field) {
        this.field = field;
    }
    
    public String getName() {
        return name;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getMinorDev() {
        return minorDev;
    }

    public void setMinorDev(int minorDev) {
        this.minorDev = minorDev;
    }

    public boolean getMajorDev() {
        return majorDev;
    }

    public void setMajorDev(boolean majorDev) {
        this.majorDev = majorDev;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean isOwned() { // Getter method
        return owned;
    }

    public void setOwned(boolean owned) { // Setter method
        this.owned = owned;
    }
}

//I feel these should be different, separate classes and not within the Square class, considering the SOLID principle

//HomeField
class HomeField extends Square {
    public HomeField(String name, boolean owned, Field field, int purchaseCost, int minorDev, boolean majorDev) {
        super(name, purchaseCost, minorDev, majorDev);
        this.setField(field);
        this.setOwned(owned);
    }
}

//SupplyChainField
class SupplyChainField extends Square {
    public SupplyChainField(String name, boolean owned, Field field, int purchaseCost, int minorDev, boolean majorDev) {
        super(name, purchaseCost, minorDev, majorDev);
        this.setField(field);
    }
}

//BiodiversityField
class BiodiversityField extends Square {
    public BiodiversityField(String name, boolean owned, Field field, int purchaseCost, int minorDev, boolean majorDev) {
        super(name, purchaseCost, minorDev, majorDev);
        this.setField(field);
    }
}

 //TransportField
class TransportField extends Square {
    public TransportField(String name, boolean owned, Field field, int purchaseCost, int minorDev, boolean majorDev) {
        super(name, purchaseCost, minorDev, majorDev);
        this.setField(field);
    }

}