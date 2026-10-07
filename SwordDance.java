import ru.ifmo.se.pokemon.*;

public final class SwordDance extends StatusMove {
    public SwordDance() {
        super(Type.NORMAL,0,1.0F);
    }

    @Override 
    protected java.lang.String describe() {
        return "uses Sword Dance";
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1.0).turns(1).stat(Stat.ATTACK, 2));
    }

    @Override 
    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
