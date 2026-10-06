import ru.ifmo.se.pokemon.*;

public final class Growth extends StatusMove{
    public Growth() {
        super(Type.NORMAL,0,1.0F);
    }

    protected java.lang.String describe() {
        return "uses Growth";
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1.0).turns(1).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1));
    }

    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
