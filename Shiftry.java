public final class Shiftry extends Nuzleaf {
    public Shiftry(String var1, int var2) {
        super(var1, var2);
        this.setStats(90,100,60,90,60,80);
        this.addMove(new Snarl());
    }

    public Shiftry() {
        this("Shiftry", 14);
    }
}
