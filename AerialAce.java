import ru.ifmo.se.pokemon.*;

public final class AerialAce extends PhysicalMove{
    public AerialAce() {
        super(Type.FLYING,60,1.0F);
    }

    protected java.lang.String describe() {
        return "uses Aerial Ace";
    }

    protected boolean checkAccuracy(Pokemon att,Pokemon def){
        return true;
    }
}
