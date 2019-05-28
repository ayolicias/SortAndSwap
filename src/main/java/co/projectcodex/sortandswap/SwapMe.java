package co.projectcodex.sortandswap;

public class SwapMe {

    public static String[] swapFirstWithLast(String[] values) {
        String firstName = values[0];
        values[0] = values[values.length -1];
        values[values.length -1] = firstName;
        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {
        String firstName = values[0];

        values[0] = values[1];
        values[1] = firstName;

        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            if (i + 1 < numbers.length) {
                int current = numbers[i];
                int next = numbers[i + 1];

                if (current > next) {
                    numbers[i] = next;
                    numbers[i+1] = current;

                }
            }

        }
        return numbers;

    }
    }
