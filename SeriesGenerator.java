package Generator;

public abstract class SeriesGenerator {
    private int n;
    protected int series = 0;
    protected float[] elements;
    public SeriesGenerator(int n) {
        this.n = n;
        elements = new float[n];
    }
    protected float[] calculateElements(){
        elements = calculateElement(n);
        return elements;
    }
    protected abstract float[] calculateElement(int n);
}
