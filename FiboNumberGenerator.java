package Generator;

public class FiboNumberGenerator extends SeriesGenerator{

    public FiboNumberGenerator(int n) {
        super(n);
    }
    @Override
    protected float[] calculateElement(int n) {
        if (n != series) {
            if(series == 0 || series == 1){
                elements[series] = 1.0f;
                series++;
                calculateElement(n);
            }else{
                elements[series] = elements[series - 1] + elements[series - 2];
                series++;
                calculateElement(n);
            }
        }
        return elements;
    }

}
