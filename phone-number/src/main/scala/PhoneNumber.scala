
class PhoneNumber(phNumber: String) {

  def number = {
    if (validNumber.length == 10) validNumber
    else "0"*10
  }

  lazy val validNumber = {
    val phoneNumber = phNumber.replaceAll("\\D", "")
    if(phoneNumber.length == 11 && phoneNumber.startsWith("1")) phoneNumber.tail
    else phoneNumber
  }

  def areaCode = number.take(3)

  override def toString: String = {
    val localExchange = number.slice(3, 6)
    val subscriberNumber = number.takeRight(4)
    s"($areaCode) $localExchange-$subscriberNumber"
  }
}

