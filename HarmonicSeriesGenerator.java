package Generator;

public class HarmonicSeriesGenerator extends SeriesGenerator {
    public HarmonicSeriesGenerator(int n) {
        super(n);
    }
    @Override
    protected float[] calculateElement(int n) {
        if(n != series){
            elements[series] = 1f/(++series);
            calculateElement(n);
        }
        return elements;
    }
}
