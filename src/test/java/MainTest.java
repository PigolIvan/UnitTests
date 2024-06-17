import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test1() {
        int[] array = new int[]{1, 5, 4, 7, 9, 4};
        int arithmeticMean = Main.ArithmeticMeanFromArray(array);

        Assertions.assertEquals(6, arithmeticMean);
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean isCubic = Main.isArrayCube(matrix);

        Assertions.assertTrue(isCubic);
    }
}
