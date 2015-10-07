import java.util.stream.LongStream;

import static java.lang.Integer.parseInt;

public class LuckyTicketUnoptimized implements LuckyTicket {

    /**
     *   Проверяет, является ли заданный номер билета счастливым.
     *   Примеры:
     *   isLucky("123600") = true
     *   isLucky("123456") = false
     */
    @Override public boolean isLucky(String ticketNumber) {
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

    @Override public long countLucky(long min, long max) {
        return LongStream.rangeClosed(min, max).filter(this::isLucky).count();
    }

    /**
     * Рассчитывает количество различных счастливых билетов с номером в заданном диапазоне,
     * включая границы.
     * Длина номера билета 12 цифр.
     * Пример:
     * countLucky(123456123456L, 123456123465L) = 2
     */
    private boolean isLucky(long ticketNumber) {
        return isLucky(String.valueOf(ticketNumber));
    }

    @Override public long countLucky(String min, String max) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    // consider using string builder
    private static String trimLeadingZeros(String original) {
        char c = original.charAt(0);
        while (c == '0') {
            original = original.substring(1);
            c = original.charAt(0);
        }
        return original;
    }
}
