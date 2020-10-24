package moneycalculator;

public class Currency {
    
    private final String name;
    private final String symbol;
    private final Double value;

    public Currency(String divisa, Double value, String symbol){
        this.name=divisa;
        this.value=value;
        this.symbol=symbol;
    }
    
    public Double getValue() {
        return value;
    }
    
}