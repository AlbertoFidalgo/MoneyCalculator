package moneycalculator;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MoneyCalculator {

    public static void main(String[] args) {
        MoneyCalculator moneycalculator = new MoneyCalculator();
        moneycalculator.execute();
    }
    
    private Map<String, Currency> currencies = new HashMap<>();
    private Currency currencyFrom;
    private Currency currencyTo;
    private ExchangeRate exchange;
    private Double amount;
    
    private void execute(){
        currencies.put("EUR", new Currency("Euro", 1.0, "€"));
        currencies.put("USD", new Currency("Dolar Americano", 1.19, "$"));
        currencies.put("GBP", new Currency("Libra Esterlina", 0.91, "L"));
        currencies.put("YEN", new Currency("Yen Japones", 124.270, "Y"));
        
        input();
        process();
        output();
    }
    
    
    private void input(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de dinero: ");
        amount = Double.parseDouble(scanner.next());
        System.out.println("Introduce divisa original: ");
        String divisaFrom = scanner.next().toUpperCase();
        System.out.println("Introduce divisa destino: ");
        String divisaTo = scanner.next().toUpperCase();
        
        currencyFrom=currencies.get(divisaFrom);
        currencyTo=currencies.get(divisaTo);
    }
    
    private void process(){
        exchange = new ExchangeRate();
        amount=amount*exchange.getExchangeRate(currencyTo, currencyFrom);
    }
    
    private void output(){
        System.out.println("El valor final es de: " + amount);
    }
        
    
}
