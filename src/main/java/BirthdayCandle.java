public class BirthdayCandle {
    public int countMaxHeightCandles(int[] candleHeights) {
        int max = 0;
        int count = 0;

        for (int height : candleHeights) {
            if (height > max) {
                max = height;
                count = 1;
            } else if (height == max) {
                count++;
            }
        }
        return count;
    }

}
