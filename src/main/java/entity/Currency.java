package entity;

public enum Currency {
    USD(431), EUR(451), RUB(456), BYN(8);
    
    private final int id;

    Currency(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
