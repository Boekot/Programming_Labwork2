import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade() {
        super(Type.NORMAL,70,1.0F);
    }

    protected java.lang.String describe() {
        return "uses Facade";
    }

    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        double pow = this.power;
        switch (var2.getCondition()) {
            case Status.BURN, Status.POISON, Status.PARALYZE:
                pow = pow * 2;
                break;
            default:
                break;
        }
        return (0.4 * (double)var1.getLevel() + (double)2.0F) * pow / (double)150.0F;
    }
}
