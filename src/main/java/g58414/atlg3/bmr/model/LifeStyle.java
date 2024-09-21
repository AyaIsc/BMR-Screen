package g58414.atlg3.bmr.model;

/**
 * enumeration of the lifestyles the user has to choose
 */
public enum LifeStyle {
    SEDENTAIRE(1.2),
    PEUACTIF(1.375),
    ACTIF(1.55),
    FORTACTIF(1.725),
    EXTREMACTIF(1.9);

    private final double coef;

    LifeStyle(double coef){
        this.coef=coef;
    }

    public double getCoef() {
        return coef;
    }
}
