public class Weapons {
    private String name;
    private int price;
    private boolean isOneHanded;
    private boolean singleOperator;
    private String damageType;

    public Weapons(String name, int price) {
        this(name, price, false, true, "");
    }

    public Weapons(String name, int price, boolean isOneHanded, boolean singleOperator, String damageType) {
        this.name = name;
        this.price = price;
        this.isOneHanded = isOneHanded;
        this.singleOperator = singleOperator;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public boolean isSingleOperator() {
        return singleOperator;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public void setSingleOperator(boolean singleOperator) {
        this.singleOperator = singleOperator;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printWeapon() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("One Handed: " + this.isOneHanded);
        System.out.println("Single Operator: " + this.singleOperator);
        System.out.println("Damage Type: " + this.damageType);
    }
}
