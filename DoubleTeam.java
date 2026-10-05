import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam() {
        super(Type.NORMAL,0,1.0F);
    }

    protected java.lang.String describe() {
        return "uses Double Team";
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1.0).turns(1).stat(Stat.EVASION, 1));
    }

    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
