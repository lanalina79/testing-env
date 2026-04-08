package sumanumarimpar;

public class CalculateSumOddNumber {

    public static int calculateSumOddNumbers(int number) {
        int result=0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 1) {
                result += i;
            }

        }

        return result;
    }
}
