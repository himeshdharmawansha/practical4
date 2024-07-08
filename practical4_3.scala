object Day4Three {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => toUpper(name.substring(0, 2)) + name.substring(2)))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => toUpper(name.substring(0, 1)) + name.substring(1, 5) + toUpper(name.substring(5, 6))))
  }
}

