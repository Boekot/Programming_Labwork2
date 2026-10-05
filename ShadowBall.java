import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST,80,1.0F);
    }

    @Override 
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.2).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    protected java.lang.String describe() {
        return "uses Shadow Ball";
    }
}
