import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String description, String dateAcquired, int originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;

        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        int valuePerSquareFoot = switch (this.condition) {
            case 1 -> 180;
            case 2 -> 130;
            case 3 -> 90;
            case 4 -> 80;
            default -> { throw new RuntimeException("The condition was not an expected int 1-4"); }
        };

        BigDecimal propertyValue = BigDecimal.valueOf(this.lotSize).multiply(new BigDecimal("0.25"));

        BigDecimal totalValue = BigDecimal.valueOf(valuePerSquareFoot).multiply(BigDecimal.valueOf(this.squareFoot)).add(propertyValue);

        return totalValue;
    }

    public String getAddress() {
        return address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }
}
