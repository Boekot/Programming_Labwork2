import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide() {
        super(Type.NORMAL,0,1.0F);
    }

    protected java.lang.String describe() {
        return "uses Confide";
    }

    @Override 
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1.0).turns(1).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
