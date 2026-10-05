import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Seedot {
    public Nuzleaf(String var1, int var2) {
        super(var1, var2);
        this.setStats(70,70,40,60,40,60);
        this.addMove(new Growth());
        this.addType(Type.DARK);
    }

    public Nuzleaf() {
        this("Nuzleaf",14);
    }
}
