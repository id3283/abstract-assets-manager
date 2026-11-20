import java.math.BigDecimal;

public class Sailboat extends Asset{
    private int engineHours;

    public Sailboat(String description, String dateAcquired, int originalCost, int engineHours) {
        super(description, dateAcquired, originalCost);
        this.engineHours = engineHours;
    }

    public int getEngineHours() {
        return engineHours;
    }

    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
