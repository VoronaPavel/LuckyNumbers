import java.math.BigInteger;
import java.util.stream.LongStream;

import static java.lang.Integer.parseInt;

public class Java {

    public static void main(String[] args) {
        System.out.println("isLucky(123600): " + LuckyTicket.isLucky("123600"));
        System.out.println("countLucky(123456123456L, 123456123465L): " + LuckyTicket.countLucky(123456123456L, 123456123465L));
        System.out.println("countLucky(\"00123456123456\", \"000000123456123465\"): " + LuckyTicket.countLucky("00123456123456", "000000123456123465"));
    }

    public static class LuckyTicket {

        public static boolean isLucky(String ticketNumber) {
            int length = ticketNumber.length();
            String firstHalf = ticketNumber.substring(0, length / 2);
            String secondHalf = ticketNumber.substring(length / 2);
            return sumOfDigits(parseInt(firstHalf)) == sumOfDigits(parseInt(secondHalf));
        }

        private static int sumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }

        public static long countLucky(long min, long max) {
            return LongStream.rangeClosed(min, max).filter(LuckyTicket::isLucky).count();
        }

        private static boolean isLucky(long ticketNumber) {
            return isLucky(String.valueOf(ticketNumber));
        }

        public static long countLucky(String min, String max) {
            BigInteger end = new BigInteger(max);
            long count = 0;
            for (BigInteger i = new BigInteger(min); i.compareTo(end) <= 0; i = i.add(BigInteger.ONE)) {
                if (isLucky(i.toString())) {
                    count++;
                }
            }
            return count;
        }
    }

}
