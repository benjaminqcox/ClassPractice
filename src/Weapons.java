public class Weapons {
    private String name;
    private int price;
    private boolean isOneHanded;
    private boolean isSingleOperator;
    private String damageType;

    public Weapons(String name, int price) {
        this(name, price, false, true, "");
    }

    public Weapons(String name, int price, boolean isOneHanded, boolean isSingleOperator, String damageType) {
        this.name = name;
        this.price = price;
        this.isOneHanded = isOneHanded;
        this.isSingleOperator = isSingleOperator;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean getIsOneHanded() {
        return isOneHanded;
    }

    public boolean getIsSingleOperator() {
        return isSingleOperator;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public void setIsSingleOperator(boolean singleOperator) {
        this.isSingleOperator = singleOperator;
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
        System.out.println("Single Operator: " + this.isSingleOperator);
        System.out.println("Damage Type: " + this.damageType);
    }
}
