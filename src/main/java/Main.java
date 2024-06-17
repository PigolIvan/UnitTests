public class Main {
    public static int ArithmeticMeanFromArray(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length + 1;
    }
    public static boolean isArrayCube(int[][] matrix) {
        int sum1 = 0;
        int sum2 = 0;
        int length = 0;
        int count = 0;
        for(int[] row : matrix){
           sum1++;
           for(int column : row){
               sum2++;
           }
        }
        for(int[] row : matrix){
            length = row.length;
            System.out.println(length);
            if(sum1 != length){
                count++;
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        }
        if(sum1 == sum2/sum1 && count == 0){
            return true;
        }else{
            return false;
        }
    }
}
