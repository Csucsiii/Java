package Generator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FiboNumberGenerator fiboGenerator = new FiboNumberGenerator(10);
        System.out.println(Arrays.toString(fiboGenerator.calculateElements()));

        HarmonicSeriesGenerator harmonicGenerator = new HarmonicSeriesGenerator(10);
        System.out.println(Arrays.toString(harmonicGenerator.calculateElements()));
    }
}
