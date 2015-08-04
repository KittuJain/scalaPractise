class Anagram(input: String) {
  def matches(words: Seq[String]) = {
    val lowerCaseString = input.toLowerCase

    words.filter{
      word =>
        val lowerCaseWord = word.toLowerCase
        word.length == input.length &&
          lowerCaseWord != lowerCaseString &&
          (lowerCaseString.toSeq diff lowerCaseWord.toSeq).isEmpty
    }
  }
}