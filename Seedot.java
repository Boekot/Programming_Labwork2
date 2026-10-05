import ru.ifmo.se.pokemon.*;

public class Seedot extends Pokemon { 
    public Seedot(String var1, int var2) {
        super(var1, var2);
        this.setType(Type.GRASS);
        this.setStats(40,40,50,30,30,30);
        this.setMove(new SwordDance(), new Facade());
    }

    public Seedot() {
        this("Seedot",10);
    }
}
