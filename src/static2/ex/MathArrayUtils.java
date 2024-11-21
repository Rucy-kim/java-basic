package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        return (double) sum / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
