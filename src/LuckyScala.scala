object LuckyScala extends LuckyTicket {

  def isLucky(ticketNumber: String) = {
    val (left, right) = ticketNumber.splitAt(ticketNumber.length / 2)
    sumOfDigits(left) == sumOfDigits(right)
  }

  def countLucky(min: Long, max: Long) = {
    Range.Long.inclusive(min, max, 1).count(element => isLucky(element.toString))
  }

  def countLucky(min: String, max: String) = {
    Range.BigInt.inclusive(BigInt(min), BigInt(max), 1).count(element => isLucky(element.toString()))
  }

  private def sumOfDigits(number: String) = number.map(_.asDigit).sum
}
