public final class Hypno extends Drowzee{
    public Hypno(String var1, int var2) {
        super(var1,var2);
        this.setStats(85,73,70,73,115,67);
        this.addMove(new FocusBlast());
    }

    public Hypno() {
        this("Hypno",26);
    }
}
