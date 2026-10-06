import ru.ifmo.se.pokemon.*;

public final class Snarl extends SpecialMove{
    public Snarl() {
        super(Type.DARK,55,0.95F);
    }

    @Override 
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.7).turns(1).stat(Stat.SPECIAL_ATTACK, 1));
    }

    protected java.lang.String describe() {
        return "uses Snarl";
    }
}    