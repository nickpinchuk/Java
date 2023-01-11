import java.util.Arrays;

public class ArrayValueCalculator {
    public static void main(String[] args) {

        try {
            int result = doCalc(new String[][]{{"2", "4", "5", "6"}, {"5", "6", "7", "7"}, {"9", "10", "11", "8"}, {"9", "5", "1", "14"}});
            System.out.println("Summ = " +result);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println(exception.getMessage());
        }

    }

    static int doCalc(String [][] arrayNumbers) {
        int sum = 0;
        for (int i = 0; i <= arrayNumbers.length -1; i++ ) {
            for (int j = 0; j <= arrayNumbers[i].length -1; j++) {
                if(arrayNumbers.length !=4 || arrayNumbers[i].length !=4) throw new ArraySizeException();
                try {
                    sum += Integer.parseInt(arrayNumbers[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }

        }

    return sum;
    }
    }
