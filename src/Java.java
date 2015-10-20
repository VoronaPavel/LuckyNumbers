public class Java {
    public static void main(String[] args) {
        System.out.println(LuckyTicketUnoptimized.isLucky("123600"));
        System.out.println(LuckyTicketUnoptimized.countLucky(123456123456L, 123456123465L));
        System.out.println(LuckyTicketUnoptimized.countLucky("00123456123456", "000000123456123465"));
    }
}
