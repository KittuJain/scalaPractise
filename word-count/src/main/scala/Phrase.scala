
class Phrase(sentence: String) {
  def wordCount = {
    val words = sentence.toLowerCase.split("\\s+|,")

    words.map(word => {
      word.replaceAll("[!:&@$%^&.]", "") -> countSubstring(words, word)
    }).toMap.filterNot(_._1.isEmpty)
  }

  def countSubstring(words: Seq[String], word: String) = words.count(_ == word)
}