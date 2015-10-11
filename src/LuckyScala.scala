object LuckyScala extends LuckyTicket {

  def isLucky(number: String) = {
    val sumOfDigits = (number: String) => number.map(_.asDigit).sum
    val (left, right) = number.splitAt(number.length / 2)
    sumOfDigits(left) == sumOfDigits(right)
  }

  def countLucky(min: String, max: String) =
    Range.BigInt.inclusive(BigInt(min), BigInt(max), 1).count(element => isLucky(element toString))

  def countLucky(min: Long, max: Long) = countLucky(min toString, max toString)
}
