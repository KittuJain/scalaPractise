import scala.util.Random

class Robot {

  var name = Random.alphanumeric.take(2).mkString + Random.nextInt(1000)

  def reset() = {
    val sb = Random.alphanumeric.take(2).mkString + Random.nextInt(1000)
    name = sb
  }
}