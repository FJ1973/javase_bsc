package hu.training360.javase_bsc;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal unitWeigth;
    private int numberOfDecimals;

    public Product(String name, BigDecimal unitWeigth, int numberOfDecimals) {
        this.name = name;
        this.unitWeigth = unitWeigth;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeigth) {
        this.name = name;
        this.unitWeigth = unitWeigth;
        numberOfDecimals = 2;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeigth() {
        return unitWeigth;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){
        BigDecimal res = BigDecimal.valueOf(pieces).multiply(unitWeigth).setScale(numberOfDecimals);
        return res;
    }
}
