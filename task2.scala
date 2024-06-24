object task2 {
  def main(args:Array[String]):Unit={
    val arrayvow = Array("america", "australia", "china", "japan", "india")
    val vow = Array('a', 'e', 'i', 'o', 'u')
    val groupvow = arrayvow.groupBy(country => if (vow.contains(country.charAt(0).toLower)) "vowels" else "consonants")
    groupvow.foreach {
      case (key, value) => println(s"$key:${value.mkString(",")}")
    }
  }
}
