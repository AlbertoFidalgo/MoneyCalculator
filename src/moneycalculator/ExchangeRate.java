package moneycalculator;

public class ExchangeRate {
    
    public Double getExchangeRate(Currency To, Currency From){
        return To.getValue()/From.getValue();
    }
    
}
