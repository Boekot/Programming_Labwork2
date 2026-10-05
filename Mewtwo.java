import ru.ifmo.se.pokemon.*;

public class Mewtwo extends Pokemon { 
    public Mewtwo(String var1, int var2) {
        super(var1, var2);
        this.setType(Type.PSYCHIC);
        this.setStats(106,110,90,154,90,130);
        this.setMove(new FocusBlast(),new ShadowBall(),new ChargeBeam(),new AerialAce());
    }

    public Mewtwo() {
        this("Mewtwo",30);
    }
}
