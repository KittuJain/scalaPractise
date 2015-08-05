
class Anagram(input: String) {

  val text = input.toLowerCase

  def process(word: String) = word.toList.sorted

  def test(word: String) = {
    word.toLowerCase != text && process(word.toLowerCase) == process(text)
  }

  def matches(words: Seq[String]) = words.filter(word => test(word))
}