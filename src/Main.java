// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int countElementsWithGreater(int[] A) {
        int maxElement = Integer.MIN_VALUE;
        int count = 0;

        for (int num : A) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        for (int num : A) {
            if (num < maxElement) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 1, 2};
        System.out.println(countElementsWithGreater(A1));

        int[] A2 = {5, 5, 3};
        System.out.println(countElementsWithGreater(A2));
    }
}