import Sentence.{Silence, Interrogative, Shouting, Statement}

sealed trait Sentence {
  def response : String
}

object Sentence {
  case object Shouting extends Sentence {
    override def response: String = "Whoa, chill out!"
  }
  case object Interrogative extends Sentence {
    override def response: String = "Sure."
  }
  case object Silence extends Sentence {
    override def response: String = "Fine. Be that way!"
  }
  case object Statement extends Sentence {
    override def response: String = "Whatever."
  }
}

object Sentences {
  def getType(str: String) = {
    str match{
      case str if str.exists(_.isLetter) && (str.toUpperCase == str) => Shouting
      case str if str.endsWith("?")  => Interrogative
      case str if str.forall(_.isSpaceChar) => Silence
      case _ => Statement
    }
  }
}

class Bob {
  def hey(input: String): String = {
    Sentences.getType(input).response
  }
}
