package hu.training360.javase_bsc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PacketProduct extends Product {
    private int packingUnit;
    private BigDecimal weigthOfBox;

    public PacketProduct(String name, BigDecimal unitWeigth, int numberOfDecimals, int packingUnit, BigDecimal weigthOfBox) {
        super(name, unitWeigth, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weigthOfBox = weigthOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeigthOfBox() {
        return weigthOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int numberOfBoxes = pieces % packingUnit == 0 ? pieces / packingUnit : pieces / packingUnit + 1;
        BigDecimal box = weigthOfBox.multiply(new BigDecimal(String.valueOf(numberOfBoxes)));

        return super.totalWeight(pieces).add(box).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }
}
