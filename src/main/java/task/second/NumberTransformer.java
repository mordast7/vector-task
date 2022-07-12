package task.second;

public class NumberTransformer {
    public int getTransformedNumber(int number) {
        int tmp = number;
        int length = 0;

        while (tmp > 0) {
            tmp /= 10;
            length++;
        }

        int[] digit = new int[length];

        for (int i = length - 1; i != -1; i--) {
            digit[i] = number % 10;
            digit[i]++;
            number /= 10;
        }

        int result = digit[0];

        for (int i = 1; i < length; i++) {
            if (digit[i] == 10) {
                result *= 10;
            }
            result *= 10;
            result += digit[i];
        }
        return result;
    }
}
