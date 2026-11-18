import java.math.BigDecimal;

public class Asset {
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    public Asset(String description, String dateAcquired, int originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = BigDecimal.valueOf(originalCost);
    }

    public BigDecimal getValue() {
        return this.originalCost;
    }

    public String getDescription() {
        return description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }
}
