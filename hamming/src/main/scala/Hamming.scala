
object Hamming {
  def compute(str1: String, str2: String) ={
    if (str1.length != str2.length)
      throw new IllegalArgumentException()
    else str1.length - ((str1, str2).zipped.toList count {
      case(a, b) => a == b
    })
  }
}
