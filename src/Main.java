public class Main {

    public static void main(String[] args) {
        LuckyTicket analyzer = new LuckyTicketUnoptimized();
        System.out.println("123600 is lucky? " + analyzer.isLucky("123600"));
        System.out.println("123456 is lucky? " + analyzer.isLucky("123456"));
        System.out.println("countLucky(123456123456L, 123456123465L) = " + analyzer.countLucky(123456123456L, 123456123465L));
    }
}