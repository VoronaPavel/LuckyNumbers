package pavel.by.scala

import pavel.by.java.LuckyTicket

object Main extends App {
  println(LuckyTicket.isLucky("123600"))
  println(LuckyTicket.countLucky(123456123456L, 123456123465L))
  println(LuckyTicket.countLucky("00123456123456", "000000123456123465"))
}
