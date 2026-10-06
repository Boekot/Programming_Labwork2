import ru.ifmo.se.pokemon.*;

public final class Labwork2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Drowzee());
        b.addAlly(new Nuzleaf());
        b.addAlly(new Mewtwo());
        b.addFoe(new Seedot());
        b.addFoe(new Shiftry());
        b.addFoe(new Hypno());
        b.go(); 
    }
}