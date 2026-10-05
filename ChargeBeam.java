import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{
    public ChargeBeam() {
        super(Type.ELECTRIC,50,0.9F);
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.7).turns(1).stat(Stat.SPECIAL_ATTACK, 1));
    }

    protected java.lang.String describe() {
        return "uses Charge Beam";
    }
}    