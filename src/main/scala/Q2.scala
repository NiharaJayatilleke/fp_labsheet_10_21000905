object Q2 extends App{

  def countLetterOccurrences (wordList : List[String]): Int = {
    val lenList = wordList.map(_.length)
    val totCount = lenList.reduce(_ + _)
    totCount
  }

  val input = List("apple", "banana", "cherry", "date")
  println("Total count of letter occurrences: "+ countLetterOccurrences(input))
}
