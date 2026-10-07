import ru.ifmo.se.pokemon.*;

public final class CalmMind extends StatusMove{
    public CalmMind() {
        super(Type.PSYCHIC,0,1.0F);
    }

    @Override 
    protected java.lang.String describe() {
        return "uses Calm Mind";
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1.0).turns(1).stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1));
    }

    @Override 
    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
