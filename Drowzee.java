import ru.ifmo.se.pokemon.*;

public class Drowzee extends Pokemon { 
    public Drowzee(String var1, int var2) {
        super(var1, var2);
        this.setType(Type.PSYCHIC);
        this.setStats(60,48,45,43,90,42);
        this.setMove(new CalmMind(),new Confide(),new DoubleTeam());
    }

    public Drowzee() {
        this("Drowzee",17);
    }
}
