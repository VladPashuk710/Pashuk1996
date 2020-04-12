package lecture_6;

import java.util.Objects;

public class FractionNumber {
    private int nominator;
    private int denominator;

    public FractionNumber(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public FractionNumber(String s, String s1, int nominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public FractionNumber(String s, String s1) {
        this.nominator = nominator;
    }

    public final FractionNumber devide(FractionNumber other) {
        return null;
    }

    public final FractionNumber multiply(FractionNumber other) {
        return null;
    }

    public final FractionNumber plus(FractionNumber other) {
        return null;
    }

    public final FractionNumber minus(FractionNumber other) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return nominator == that.nominator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominator, denominator);
    }

    @Override
    public String toString() {
        return "2" + "/" + "3";
    }

    public static void main(String[] args) {

        FractionNumber fraction = new FractionNumber("2", "3");
        System.out.println("2/3");
    }
}





