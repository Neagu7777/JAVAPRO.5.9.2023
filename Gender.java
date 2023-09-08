package ConstructorPerson;

public enum Gender {
    MALE(1.5),
    FEMALE(1.3);

    private final double coefficientOfCost;

    Gender(double coefficientOfCost) {
        this.coefficientOfCost = coefficientOfCost;
    }

    public double getCoefficientOfCost() {
        return coefficientOfCost;
    }
}

